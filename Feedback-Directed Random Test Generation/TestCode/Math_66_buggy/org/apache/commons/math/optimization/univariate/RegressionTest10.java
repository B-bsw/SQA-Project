package org.apache.commons.math.optimization.univariate;

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
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        double double14 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double16 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction19 = null;
        org.apache.commons.math.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = brentOptimizer0.optimize(univariateRealFunction19, goalType20, (double) 52, 0.0d);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
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
        double double15 = brentOptimizer0.getStartValue();
        int int16 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        int int18 = brentOptimizer0.getMaximalIterationCount();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        double double13 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getStartValue();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getRelativeAccuracy();
        double double6 = brentOptimizer0.getMin();
        double double7 = brentOptimizer0.getFunctionValue();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 0.0f);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, (double) 0.0f, (double) (short) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        int int9 = brentOptimizer0.getIterationCount();
        int int10 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
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
        brentOptimizer0.setMaximalIterationCount(10);
        int int19 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
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
        double double11 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        int int14 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        double double4 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
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
        brentOptimizer0.setMaximalIterationCount(2147483647);
        double double12 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, 0.0d, (double) 52, (double) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        double double4 = brentOptimizer0.getFunctionValue();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaxEvaluations((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        int int2 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = brentOptimizer0.getGoalType();
        double double4 = brentOptimizer0.getStartValue();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
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
        double double12 = brentOptimizer0.getRelativeAccuracy();
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-10d + "'", double13 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-10d + "'", double14 == 1.0E-10d);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        int int6 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 97);
        brentOptimizer0.setMaximalIterationCount(0);
        int int11 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int13 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy(1.0E-14d);
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
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
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        int int13 = brentOptimizer0.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
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
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 100);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 1L);
        brentOptimizer0.resetAbsoluteAccuracy();
        int int10 = brentOptimizer0.getIterationCount();
        double double11 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double4 = brentOptimizer0.getFunctionValue();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.optimize(univariateRealFunction6, goalType7, (double) (byte) -1, 97.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setAbsoluteAccuracy(1.0d);
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        int int10 = brentOptimizer0.getEvaluations();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
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
        int int12 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMin();
        int int7 = brentOptimizer0.getMaximalIterationCount();
        double double8 = brentOptimizer0.getStartValue();
        double double9 = brentOptimizer0.getMin();
        double double10 = brentOptimizer0.getStartValue();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        double double13 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        int int6 = brentOptimizer0.getMaximalIterationCount();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) (short) 1);
        brentOptimizer0.setAbsoluteAccuracy(1.0E-14d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        double double15 = brentOptimizer0.getFunctionValue();
        int int16 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) 1);
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
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
        brentOptimizer0.setAbsoluteAccuracy(32.0d);
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
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
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
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        int int12 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(1.0d);
        double double8 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
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
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass15 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
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
        int int11 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
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
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getMaxEvaluations();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentOptimizer0.optimize(univariateRealFunction14, goalType15, (double) '4', (double) '4', (double) ' ');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
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
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
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
        double double13 = brentOptimizer0.getFunctionValue();
        double double14 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double13 = brentOptimizer0.getFunctionValue();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        double double15 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-10d + "'", double14 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        int int10 = brentOptimizer0.getEvaluations();
        double double11 = brentOptimizer0.getMin();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.resetAbsoluteAccuracy();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((-1.0d));
        double double14 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
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
        int int14 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 100);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 0);
        int int10 = brentOptimizer0.getEvaluations();
        int int11 = brentOptimizer0.getEvaluations();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        double double13 = brentOptimizer0.getFunctionValue();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
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
        brentOptimizer0.setRelativeAccuracy((double) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
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
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        double double10 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaxEvaluations(100);
        brentOptimizer0.setMaximalIterationCount((int) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
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
        double double14 = brentOptimizer0.getStartValue();
        brentOptimizer0.setRelativeAccuracy(1.0d);
        double double17 = brentOptimizer0.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
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
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        int int16 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations(1);
        brentOptimizer0.resetMaximalIterationCount();
        double double20 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType21 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNull(goalType21);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
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
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, (double) 10, 10.0d);
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
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
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
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        int int9 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, (double) 10.0f, (double) 100L, 32.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        brentOptimizer0.setAbsoluteAccuracy((double) 100);
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getMax();
        double double8 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaxEvaluations(10);
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getFunctionValue();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        double double14 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        double double7 = brentOptimizer0.getStartValue();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        int int9 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, (double) ' ', (double) (short) 10, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        double double7 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 100L);
        double double10 = brentOptimizer0.getFunctionValue();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
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
        int int14 = brentOptimizer0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        double double10 = brentOptimizer0.getFunctionValue();
        int int11 = brentOptimizer0.getEvaluations();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 1);
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getFunctionValue();
        double double4 = brentOptimizer0.getStartValue();
        double double5 = brentOptimizer0.getRelativeAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
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
        double double13 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((int) '4');
        double double16 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        int int5 = brentOptimizer0.getMaxEvaluations();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, (double) 10.0f, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.optimize(univariateRealFunction6, goalType7, 97.0d, (double) (-1.0f), (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
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
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        brentOptimizer0.setRelativeAccuracy((double) (-1));
        brentOptimizer0.setAbsoluteAccuracy((double) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((int) '#');
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        int int6 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 97);
        brentOptimizer0.setMaximalIterationCount(0);
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) 52);
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaxEvaluations(10);
        double double6 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getFunctionValue();
        double double4 = brentOptimizer0.getStartValue();
        double double5 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
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
        double double13 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType15 = brentOptimizer0.getGoalType();
        int int16 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
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
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(52);
        int int17 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-10d + "'", double14 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        double double9 = brentOptimizer0.getMin();
        double double10 = brentOptimizer0.getMax();
        double double11 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) (-1.0f));
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
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
        double double13 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
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
        double double11 = brentOptimizer0.getMin();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, (double) (short) 100, (-1.0d), (double) 0.0f);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
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
        double double14 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentOptimizer0.optimize(univariateRealFunction15, goalType16, (double) (byte) 10, (double) '4');
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 100.0f);
        int int10 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) 10);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.optimize(univariateRealFunction9, goalType10, (double) 1.0f, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
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
        brentOptimizer0.setMaxEvaluations(0);
        int int15 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        int int2 = brentOptimizer0.getMaxEvaluations();
        double double3 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setRelativeAccuracy((double) (short) 100);
        double double6 = brentOptimizer0.getMax();
        int int7 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(100);
        double double11 = brentOptimizer0.getFunctionValue();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 1);
        double double15 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        double double7 = brentOptimizer0.getFunctionValue();
        int int8 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
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
        double double11 = brentOptimizer0.getStartValue();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        double double14 = brentOptimizer0.getRelativeAccuracy();
        int int15 = brentOptimizer0.getMaximalIterationCount();
        double double16 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        org.apache.commons.math.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = brentOptimizer0.optimize(univariateRealFunction17, goalType18, (double) (short) 0, (double) 100.0f);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-10d + "'", double16 == 1.0E-10d);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double8 = brentOptimizer0.getStartValue();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        double double10 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
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
        brentOptimizer0.setRelativeAccuracy((double) 100);
        int int14 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        double double7 = brentOptimizer0.getFunctionValue();
        int int8 = brentOptimizer0.getIterationCount();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        int int10 = brentOptimizer0.getIterationCount();
        double double11 = brentOptimizer0.getFunctionValue();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        double double13 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
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
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
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
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        int int14 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        double double11 = brentOptimizer0.getStartValue();
        double double12 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) '#');
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1.0f));
        double double11 = brentOptimizer0.getRelativeAccuracy();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        int int13 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
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
        double double12 = brentOptimizer0.getStartValue();
        int int13 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int15 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 10L);
        brentOptimizer0.setRelativeAccuracy((double) 1);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
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
        double double14 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getMin();
        double double9 = brentOptimizer0.getStartValue();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentOptimizer0.optimize(univariateRealFunction15, goalType16, (double) 0.0f, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
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
        int int10 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaxEvaluations((-1));
        double double13 = brentOptimizer0.getMin();
        int int14 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
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
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy(2.147483647E9d);
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
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
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int9 = brentOptimizer0.getEvaluations();
        int int10 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, (double) 10, 1.0E-10d);
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
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 1);
        int int8 = brentOptimizer0.getMaximalIterationCount();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        int int10 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
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
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int15 = brentOptimizer0.getEvaluations();
        int int16 = brentOptimizer0.getEvaluations();
        double double17 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.setAbsoluteAccuracy((double) 100.0f);
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 1);
        double double11 = brentOptimizer0.getStartValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, (double) (short) 100, (double) 0.0f);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
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
        brentOptimizer0.setMaxEvaluations((int) ' ');
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
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
        double double12 = brentOptimizer0.getFunctionValue();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        brentOptimizer0.resetMaximalIterationCount();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1));
        brentOptimizer0.setAbsoluteAccuracy((double) 0L);
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        int int14 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
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
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        double double14 = brentOptimizer0.getRelativeAccuracy();
        int int15 = brentOptimizer0.getEvaluations();
        int int16 = brentOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass17 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) '#');
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1.0f));
        brentOptimizer0.setRelativeAccuracy((double) 2147483647);
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
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
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.setMaximalIterationCount((int) '#');
        double double18 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        brentOptimizer0.setMaxEvaluations((int) (short) 100);
        brentOptimizer0.setMaximalIterationCount(0);
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
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
        org.apache.commons.math.optimization.GoalType goalType18 = brentOptimizer0.getGoalType();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction19 = null;
        org.apache.commons.math.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = brentOptimizer0.optimize(univariateRealFunction19, goalType20, (double) (-1.0f), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(goalType18);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        int int10 = brentOptimizer0.getIterationCount();
        double double11 = brentOptimizer0.getMin();
        double double12 = brentOptimizer0.getMin();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
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
        double double11 = brentOptimizer0.getMin();
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
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        double double7 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentOptimizer0.doOptimize();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
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
        brentOptimizer0.setRelativeAccuracy(0.0d);
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
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int8 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, (double) 10, (double) 0.0f, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations(0);
        double double9 = brentOptimizer0.getStartValue();
        int int10 = brentOptimizer0.getIterationCount();
        int int11 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double13 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        int int8 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.optimize(univariateRealFunction9, goalType10, 1.0E-10d, (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
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
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 100);
        double double10 = brentOptimizer0.getRelativeAccuracy();
        double double11 = brentOptimizer0.getMin();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        brentOptimizer0.setAbsoluteAccuracy((double) 100);
        int int12 = brentOptimizer0.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setMaximalIterationCount(0);
        double double7 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 1);
        int int10 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        int int12 = brentOptimizer0.getMaxEvaluations();
        double double13 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        int int8 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int11 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (short) 1);
        brentOptimizer0.setRelativeAccuracy((double) 0);
        double double11 = brentOptimizer0.getMax();
        int int12 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
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
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 100);
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
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
        brentOptimizer0.setMaxEvaluations((int) '#');
        brentOptimizer0.setMaxEvaluations((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 100.0f);
        int int9 = brentOptimizer0.getMaximalIterationCount();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        double double12 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setRelativeAccuracy(1.0d);
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getFunctionValue();
        double double10 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy((double) 1);
        double double11 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.doOptimize();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        int int10 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
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
        int int11 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy(10.0d);
        int int14 = brentOptimizer0.getIterationCount();
        double double15 = brentOptimizer0.getFunctionValue();
        int int16 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaximalIterationCount();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        int int10 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        double double13 = brentOptimizer0.getMin();
        int int14 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
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
        double double11 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getStartValue();
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getFunctionValue();
        java.lang.Class<?> wildcardClass12 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(1);
        int int6 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        double double8 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 1);
        int int11 = brentOptimizer0.getMaxEvaluations();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        int int13 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        double double6 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setAbsoluteAccuracy(1.0E-14d);
        brentOptimizer0.setMaxEvaluations(10);
        int int11 = brentOptimizer0.getIterationCount();
        double double12 = brentOptimizer0.getMin();
        brentOptimizer0.setMaximalIterationCount((int) (short) -1);
        brentOptimizer0.setAbsoluteAccuracy((double) 2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getStartValue();
        double double7 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        double double5 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        double double8 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        int int7 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
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
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        int int16 = brentOptimizer0.getEvaluations();
        int int17 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMin();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = goalType9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getStartValue();
        brentOptimizer0.setRelativeAccuracy((double) (short) 100);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int13 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        int int10 = brentOptimizer0.getMaxEvaluations();
        double double11 = brentOptimizer0.getFunctionValue();
        double double12 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaximalIterationCount();
        int int8 = brentOptimizer0.getIterationCount();
        double double9 = brentOptimizer0.getFunctionValue();
        int int10 = brentOptimizer0.getEvaluations();
        double double11 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        int int2 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        double double4 = brentOptimizer0.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
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
        int int12 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) 52);
        int int15 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setMaximalIterationCount(0);
        double double7 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 1);
        double double10 = brentOptimizer0.getStartValue();
        java.lang.Class<?> wildcardClass11 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double8 = brentOptimizer0.getMax();
        int int9 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) 2147483647);
        double double12 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.147483647E9d + "'", double12 == 2.147483647E9d);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy(1.0E-14d);
        int int7 = brentOptimizer0.getIterationCount();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        int int9 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        int int9 = brentOptimizer0.getIterationCount();
        int int10 = brentOptimizer0.getIterationCount();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        double double12 = brentOptimizer0.getMin();
        int int13 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        double double4 = brentOptimizer0.getFunctionValue();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((-1));
        java.lang.Class<?> wildcardClass8 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(10);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.optimize(univariateRealFunction9, goalType10, 52.0d, (double) 0);
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
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
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
        int int13 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount(0);
        int int16 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getMax();
        int int9 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaximalIterationCount();
        int int8 = brentOptimizer0.getIterationCount();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        int int11 = brentOptimizer0.getEvaluations();
        double double12 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
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
        int int11 = brentOptimizer0.getEvaluations();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        int int14 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
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
        double double12 = brentOptimizer0.getStartValue();
        brentOptimizer0.setRelativeAccuracy(1.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getMax();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        double double11 = brentOptimizer0.getMin();
        double double12 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((int) '#');
        double double10 = brentOptimizer0.getStartValue();
        double double11 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        int int2 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass4 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy((double) 2147483647);
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getMin();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
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
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double13 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass16 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
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
        brentOptimizer0.setRelativeAccuracy(0.0d);
        double double14 = brentOptimizer0.getStartValue();
        int int15 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        brentOptimizer0.setMaximalIterationCount(52);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType15 = brentOptimizer0.getGoalType();
        double double16 = brentOptimizer0.getMin();
        brentOptimizer0.setRelativeAccuracy((double) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        double double10 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
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
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentOptimizer0.optimize(univariateRealFunction15, goalType16, (double) (short) 100, 52.0d);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getFunctionValue();
        int int6 = brentOptimizer0.getEvaluations();
        double double7 = brentOptimizer0.getFunctionValue();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
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
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) -1);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int16 = brentOptimizer0.getMaximalIterationCount();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
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
        int int12 = brentOptimizer0.getIterationCount();
        int int13 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = brentOptimizer0.optimize(univariateRealFunction15, goalType16, (double) 97, (double) (short) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int9 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
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
        double double11 = brentOptimizer0.getFunctionValue();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        int int13 = brentOptimizer0.getIterationCount();
        int int14 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
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
        brentOptimizer0.resetAbsoluteAccuracy();
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
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
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
        brentOptimizer0.setMaximalIterationCount((int) (short) 100);
        double double13 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        int int15 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy(10.0d);
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        brentOptimizer0.setRelativeAccuracy((double) (short) 1);
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        double double7 = brentOptimizer0.getFunctionValue();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        int int10 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        double double13 = brentOptimizer0.getMin();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        int int2 = brentOptimizer0.getMaxEvaluations();
        double double3 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setRelativeAccuracy((double) (short) 100);
        double double6 = brentOptimizer0.getMax();
        int int7 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        double double10 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType5 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMin();
        double double7 = brentOptimizer0.getStartValue();
        int int8 = brentOptimizer0.getEvaluations();
        double double9 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        int int9 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getStartValue();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
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
        double double13 = brentOptimizer0.getMin();
        double double14 = brentOptimizer0.getRelativeAccuracy();
        int int15 = brentOptimizer0.getIterationCount();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 0);
        double double7 = brentOptimizer0.getMin();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double5 = brentOptimizer0.getStartValue();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) ' ');
        int int9 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) ' ');
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        int int10 = brentOptimizer0.getEvaluations();
        double double11 = brentOptimizer0.getMin();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        int int14 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-10d + "'", double13 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) (-1));
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getStartValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, (double) 32, (double) 100.0f, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getStartValue();
        brentOptimizer0.setRelativeAccuracy((double) (short) 100);
        brentOptimizer0.resetRelativeAccuracy();
        double double10 = brentOptimizer0.getMin();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        double double13 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 1L);
        int int9 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        brentOptimizer0.setAbsoluteAccuracy((double) 0L);
        int int15 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double11 = brentOptimizer0.getFunctionValue();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        double double16 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
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
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 1);
        brentOptimizer0.setMaximalIterationCount(35);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, 2.147483647E9d, (double) 0L, (double) 100L);
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        int int9 = brentOptimizer0.getIterationCount();
        double double10 = brentOptimizer0.getMax();
        double double11 = brentOptimizer0.getStartValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, (double) 'a', (double) 10, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        double double7 = brentOptimizer0.getMax();
        int int8 = brentOptimizer0.getMaxEvaluations();
        int int9 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        double double11 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setRelativeAccuracy((double) '4');
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        int int16 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType17 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(goalType17);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaximalIterationCount(0);
        brentOptimizer0.setMaxEvaluations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
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
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        int int8 = brentOptimizer0.getMaximalIterationCount();
        double double9 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getMin();
        int int12 = brentOptimizer0.getIterationCount();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        double double8 = brentOptimizer0.getStartValue();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        double double8 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        double double10 = brentOptimizer0.getMin();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, (double) (byte) -1, (double) 2147483647, (double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
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
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType5 = brentOptimizer0.getGoalType();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType5 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.setAbsoluteAccuracy(2.147483647E9d);
        brentOptimizer0.setRelativeAccuracy((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getMax();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getMax();
        double double11 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.optimize(univariateRealFunction7, goalType8, (double) 35, (double) (short) 1, (double) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
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
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.resetMaximalIterationCount();
        int int14 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double16 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        double double9 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int8 = brentOptimizer0.getMaximalIterationCount();
        double double9 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
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
        int int12 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (short) 1);
        double double9 = brentOptimizer0.getMax();
        int int10 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(2147483647);
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
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
        int int10 = brentOptimizer0.getMaxEvaluations();
        double double11 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getEvaluations();
        int int9 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(100);
        brentOptimizer0.setMaximalIterationCount(2147483647);
        int int12 = brentOptimizer0.getMaximalIterationCount();
        double double13 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setMaxEvaluations((int) (short) 1);
        brentOptimizer0.setMaximalIterationCount(35);
        int int9 = brentOptimizer0.getEvaluations();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(35);
        int int13 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.optimize(univariateRealFunction14, goalType15, (double) (-1.0f), (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
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
        double double13 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(0);
        int int16 = brentOptimizer0.getEvaluations();
        int int17 = brentOptimizer0.getEvaluations();
        double double18 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
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
        brentOptimizer0.setAbsoluteAccuracy((double) 1L);
        int int13 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
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
        double double12 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount(52);
        double double15 = brentOptimizer0.getMax();
        int int16 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double7 = brentOptimizer0.getFunctionValue();
        double double8 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaximalIterationCount((-1));
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) 0.0f);
        int int11 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
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
        double double12 = brentOptimizer0.getStartValue();
        double double13 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
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
        double double12 = brentOptimizer0.getFunctionValue();
        double double13 = brentOptimizer0.getRelativeAccuracy();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        double double11 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        int int12 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(100);
        double double11 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount(97);
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        double double3 = brentOptimizer0.getStartValue();
        int int4 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy(97.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 1);
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getMax();
        brentOptimizer0.resetAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass11 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        brentOptimizer0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass8 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
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
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
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
        brentOptimizer0.resetMaximalIterationCount();
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
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
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
        brentOptimizer0.setAbsoluteAccuracy((double) 97);
        brentOptimizer0.setMaximalIterationCount((int) (short) -1);
        java.lang.Class<?> wildcardClass16 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getRelativeAccuracy();
        double double6 = brentOptimizer0.getMin();
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaxEvaluations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
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
        org.apache.commons.math.optimization.GoalType goalType15 = brentOptimizer0.getGoalType();
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
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
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
        brentOptimizer0.resetRelativeAccuracy();
        double double15 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy(97.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
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
        double double13 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setRelativeAccuracy((double) 52);
        brentOptimizer0.resetMaximalIterationCount();
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
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        int int11 = brentOptimizer0.getEvaluations();
        double double12 = brentOptimizer0.getFunctionValue();
        int int13 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double8 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getMax();
        double double6 = brentOptimizer0.getMax();
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-10d + "'", double9 == 1.0E-10d);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getFunctionValue();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-10d + "'", double12 == 1.0E-10d);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getStartValue();
        int int9 = brentOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.getResult();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        double double10 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int12 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
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
        double double13 = brentOptimizer0.getMax();
        int int14 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass16 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
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
        int int10 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int13 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentOptimizer0.optimize(univariateRealFunction14, goalType15, (double) (short) 1, (double) (byte) 1, (double) 52);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType17 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-10d + "'", double15 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType17);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
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
        double double14 = brentOptimizer0.getMin();
        double double15 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaxEvaluations(97);
        brentOptimizer0.setRelativeAccuracy((double) (short) 100);
        brentOptimizer0.setMaximalIterationCount((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        int int15 = brentOptimizer0.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) 10);
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 10);
        double double12 = brentOptimizer0.getMax();
        int int13 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (short) -1);
        int int9 = brentOptimizer0.getEvaluations();
        double double10 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
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
        double double13 = brentOptimizer0.getMax();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) '4');
        brentOptimizer0.setMaxEvaluations(52);
        double double19 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        double double9 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetRelativeAccuracy();
        double double11 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaxEvaluations(0);
        double double14 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double17 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) 10);
        int int10 = brentOptimizer0.getMaximalIterationCount();
        int int11 = brentOptimizer0.getMaxEvaluations();
        double double12 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
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
        double double14 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(10);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        int int10 = brentOptimizer0.getIterationCount();
        int int11 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        int int8 = brentOptimizer0.getEvaluations();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        int int11 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, (double) ' ', (double) (-1), 52.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-10d + "'", double9 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) ' ');
        brentOptimizer0.resetAbsoluteAccuracy();
        int int8 = brentOptimizer0.getIterationCount();
        int int9 = brentOptimizer0.getIterationCount();
        double double10 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        int int15 = brentOptimizer0.getMaxEvaluations();
        double double16 = brentOptimizer0.getMin();
        double double17 = brentOptimizer0.getAbsoluteAccuracy();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
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
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        int int16 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations(1);
        brentOptimizer0.resetMaximalIterationCount();
        double double20 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) '4');
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        double double8 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        int int8 = brentOptimizer0.getEvaluations();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-10d + "'", double9 == 1.0E-10d);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getStartValue();
        brentOptimizer0.setRelativeAccuracy(10.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
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
        brentOptimizer0.setMaxEvaluations((int) (short) 0);
        double double15 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 1);
        double double11 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        double double11 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
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
        int int14 = brentOptimizer0.getIterationCount();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
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
        int int12 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        org.apache.commons.math.optimization.GoalType goalType15 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getFunctionValue();
        double double10 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) 10);
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 10);
        double double12 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaximalIterationCount((-1));
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) 0.0f);
        int int11 = brentOptimizer0.getMaxEvaluations();
        double double12 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double13 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setAbsoluteAccuracy((double) '#');
        double double16 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations(100);
        int int10 = brentOptimizer0.getIterationCount();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        int int12 = brentOptimizer0.getEvaluations();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        int int14 = brentOptimizer0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
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
        double double15 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        int int9 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(100);
        double double11 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount(97);
        double double14 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int9 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double12 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(100.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        int int9 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        int int5 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 2147483647);
        java.lang.Class<?> wildcardClass9 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        double double4 = brentOptimizer0.getFunctionValue();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int11 = brentOptimizer0.getEvaluations();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        int int13 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getStartValue();
        int int7 = brentOptimizer0.getIterationCount();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        brentOptimizer0.setMaxEvaluations((-1));
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-10d + "'", double13 == 1.0E-10d);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getStartValue();
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        double double9 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        int int10 = brentOptimizer0.getEvaluations();
        int int11 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
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
        double double15 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        int int3 = brentOptimizer0.getMaxEvaluations();
        double double4 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentOptimizer0.optimize(univariateRealFunction5, goalType6, 1.0E-10d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-10d + "'", double1 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType2);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
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
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 1);
        double double17 = brentOptimizer0.getAbsoluteAccuracy();
        double double18 = brentOptimizer0.getRelativeAccuracy();
        double double19 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) 10);
        int int10 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        int int11 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int10 = brentOptimizer0.getIterationCount();
        int int11 = brentOptimizer0.getEvaluations();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(32);
        brentOptimizer0.setRelativeAccuracy((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
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
        int int13 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
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
        brentOptimizer0.setAbsoluteAccuracy(2.147483647E9d);
        java.lang.Class<?> wildcardClass15 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, (double) (byte) 100, 1.0E-14d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
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
        double double12 = brentOptimizer0.getFunctionValue();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.optimize(univariateRealFunction14, goalType15, (double) (short) -1, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of evaluations (0) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(100);
        double double11 = brentOptimizer0.getFunctionValue();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        int int2 = brentOptimizer0.getMaxEvaluations();
        double double3 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setRelativeAccuracy((double) 1L);
        int int6 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        double double7 = brentOptimizer0.getFunctionValue();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        int int10 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
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
        int int14 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        int int10 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 1);
        double double8 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) (short) 100);
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        double double7 = brentOptimizer0.getMax();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        double double8 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getStartValue();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, (double) 1L, (double) 1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
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
        brentOptimizer0.setMaximalIterationCount(10);
        double double19 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaxEvaluations(100);
        int int22 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(100);
        double double10 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 100.0f);
        double double9 = brentOptimizer0.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        double double4 = brentOptimizer0.getFunctionValue();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        double double10 = brentOptimizer0.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1L));
        double double10 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
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
        int int16 = brentOptimizer0.getMaximalIterationCount();
        int int17 = brentOptimizer0.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getMax();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) -1);
        brentOptimizer0.setMaximalIterationCount(52);
        brentOptimizer0.resetRelativeAccuracy();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
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
        double double13 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        int int5 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations(0);
        brentOptimizer0.setRelativeAccuracy((double) '#');
        int int10 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, (double) 2147483647, (double) 52, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
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
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        double double13 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMin();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, (double) (short) 10, (double) (-1L));
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.resetAbsoluteAccuracy();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((-1.0d));
        double double14 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        int int10 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int9 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-10d + "'", double12 == 1.0E-10d);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        double double7 = brentOptimizer0.getMax();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        double double9 = brentOptimizer0.getStartValue();
        double double10 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getFunctionValue();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        double double4 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaxEvaluations((int) (short) 100);
        brentOptimizer0.setRelativeAccuracy((double) (byte) -1);
        int int9 = brentOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass10 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) '4');
        double double15 = brentOptimizer0.getFunctionValue();
        int int16 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        double double4 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        double double6 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
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
        int int14 = brentOptimizer0.getIterationCount();
        double double15 = brentOptimizer0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass16 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
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
        brentOptimizer0.setRelativeAccuracy((double) (-1));
        double double16 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) 10);
        double double11 = brentOptimizer0.getMin();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(52.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-10d + "'", double12 == 1.0E-10d);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
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
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        double double14 = brentOptimizer0.getRelativeAccuracy();
        int int15 = brentOptimizer0.getIterationCount();
        int int16 = brentOptimizer0.getMaxEvaluations();
        double double17 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        brentOptimizer0.resetMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getIterationCount();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-10d + "'", double9 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        brentOptimizer0.resetMaximalIterationCount();
        double double10 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, 1.0E-14d, 52.0d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
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
        int int16 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        int int8 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) ' ');
        double double11 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
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
        brentOptimizer0.setRelativeAccuracy((double) '#');
        double double12 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 100.0f);
        int int9 = brentOptimizer0.getMaximalIterationCount();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        double double12 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        int int15 = brentOptimizer0.getEvaluations();
        int int16 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getEvaluations();
        double double7 = brentOptimizer0.getMin();
        double double8 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount(32);
        int int12 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        int int10 = brentOptimizer0.getEvaluations();
        double double11 = brentOptimizer0.getMin();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        int int13 = brentOptimizer0.getIterationCount();
        double double14 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
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
        brentOptimizer0.setMaxEvaluations(0);
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        brentOptimizer0.resetRelativeAccuracy();
        java.lang.Class<?> wildcardClass18 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double4 = brentOptimizer0.getFunctionValue();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        double double7 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.optimize(univariateRealFunction8, goalType9, (double) 1, 52.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        int int9 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy(1.0d);
        double double13 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        brentOptimizer0.resetAbsoluteAccuracy();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
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
        brentOptimizer0.resetRelativeAccuracy();
        double double16 = brentOptimizer0.getRelativeAccuracy();
        double double17 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 1);
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getMax();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMax();
        int int7 = brentOptimizer0.getMaximalIterationCount();
        double double8 = brentOptimizer0.getStartValue();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        double double11 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
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
        brentOptimizer0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass18 = brentOptimizer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
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
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int15 = brentOptimizer0.getEvaluations();
        int int16 = brentOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass17 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(10.0d);
        brentOptimizer0.setMaxEvaluations((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
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
        double double15 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        double double8 = brentOptimizer0.getFunctionValue();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double12 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        double double9 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.setAbsoluteAccuracy((-1.0d));
        double double11 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double13 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        int int2 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = brentOptimizer0.getGoalType();
        double double4 = brentOptimizer0.getStartValue();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        double double9 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getIterationCount();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass10 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        double double7 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) 100);
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        double double12 = brentOptimizer0.getMin();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, (double) 0.0f, 1.0E-14d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        brentOptimizer0.setAbsoluteAccuracy((double) 10);
        int int9 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getStartValue();
        brentOptimizer0.setRelativeAccuracy((double) (short) 100);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        int int10 = brentOptimizer0.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations((int) (short) 100);
        brentOptimizer0.resetMaximalIterationCount();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-10d + "'", double13 == 1.0E-10d);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
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
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        double double13 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations(100);
        double double16 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
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
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        brentOptimizer0.setAbsoluteAccuracy((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.doOptimize();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        brentOptimizer0.setMaxEvaluations((int) (short) 100);
        brentOptimizer0.setMaximalIterationCount(0);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(1);
        brentOptimizer0.setAbsoluteAccuracy((double) 100.0f);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.optimize(univariateRealFunction8, goalType9, 52.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
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
        int int14 = brentOptimizer0.getEvaluations();
        int int15 = brentOptimizer0.getIterationCount();
        double double16 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
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
        double double13 = brentOptimizer0.getMax();
        int int14 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType15 = brentOptimizer0.getGoalType();
        int int16 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMax();
        int int7 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        int int8 = brentOptimizer0.getEvaluations();
        double double9 = brentOptimizer0.getFunctionValue();
        double double10 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1L));
        double double13 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations((int) (short) 100);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
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
        brentOptimizer0.setMaximalIterationCount(2147483647);
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
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
        brentOptimizer0.setMaxEvaluations((-1));
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
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
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
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
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        double double15 = brentOptimizer0.getAbsoluteAccuracy();
        int int16 = brentOptimizer0.getIterationCount();
        double double17 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        double double11 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        brentOptimizer0.setMaximalIterationCount(52);
        int int14 = brentOptimizer0.getMaximalIterationCount();
        int int15 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        brentOptimizer0.setMaxEvaluations((int) '4');
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        int int7 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
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
        double double11 = brentOptimizer0.getStartValue();
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
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
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
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        double double15 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-10d + "'", double14 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
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
        double double12 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
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
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
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
        int int14 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) 2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(32.0d);
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.optimize(univariateRealFunction7, goalType8, 52.0d, 1.0E-14d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of evaluations (-1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        brentOptimizer0.setAbsoluteAccuracy((double) 100);
        double double12 = brentOptimizer0.getRelativeAccuracy();
        int int13 = brentOptimizer0.getEvaluations();
        double double14 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        double double8 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        double double14 = brentOptimizer0.getMin();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getStartValue();
        int int9 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, (double) (-1.0f), (double) (short) -1, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
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
        int int12 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
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
        int int10 = brentOptimizer0.getEvaluations();
        int int11 = brentOptimizer0.getMaxEvaluations();
        double double12 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(52);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(52.0d);
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        java.lang.Class<?> wildcardClass13 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getMin();
        double double9 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetAbsoluteAccuracy();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 100);
        brentOptimizer0.setRelativeAccuracy(10.0d);
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double15 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-10d + "'", double12 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) 10);
        int int10 = brentOptimizer0.getMaximalIterationCount();
        int int11 = brentOptimizer0.getMaxEvaluations();
        double double12 = brentOptimizer0.getStartValue();
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
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
        double double18 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) '4');
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        brentOptimizer0.setRelativeAccuracy((double) 10L);
        double double12 = brentOptimizer0.getFunctionValue();
        int int13 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentOptimizer0.optimize(univariateRealFunction14, goalType15, 35.0d, 32.0d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        double double7 = brentOptimizer0.getFunctionValue();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 0);
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations(97);
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        int int12 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 0);
        double double7 = brentOptimizer0.getStartValue();
        double double8 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        double double15 = brentOptimizer0.getMin();
        int int16 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
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
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, 100.0d, (double) (short) 100, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
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
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
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
        double double11 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) '#');
        brentOptimizer0.setMaxEvaluations(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        double double8 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) '4');
        brentOptimizer0.setMaxEvaluations(97);
        int int13 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaximalIterationCount(10);
        double double16 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
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
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        brentOptimizer0.resetMaximalIterationCount();
        int int14 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        int int16 = brentOptimizer0.getMaximalIterationCount();
        double double17 = brentOptimizer0.getRelativeAccuracy();
        double double18 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-14d + "'", double17 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-10d + "'", double18 == 1.0E-10d);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) '4');
        int int7 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy(1.0E-10d);
        double double11 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 100);
        brentOptimizer0.resetRelativeAccuracy();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        double double12 = brentOptimizer0.getMin();
        int int13 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(52.0d);
        int int11 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
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
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-10d + "'", double14 == 1.0E-10d);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMin();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        int int12 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
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
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
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
        double double15 = brentOptimizer0.getRelativeAccuracy();
        int int16 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        int int10 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, 10.0d, (double) 10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getMin();
        double double9 = brentOptimizer0.getStartValue();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        double double14 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getMax();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        int int13 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) '4');
        double double7 = brentOptimizer0.getStartValue();
        double double8 = brentOptimizer0.getMin();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        int int2 = brentOptimizer0.getEvaluations();
        int int3 = brentOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass4 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
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
        int int13 = brentOptimizer0.getIterationCount();
        int int14 = brentOptimizer0.getMaximalIterationCount();
        double double15 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType16 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType17 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(goalType16);
        org.junit.Assert.assertNull(goalType17);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(100);
        double double11 = brentOptimizer0.getFunctionValue();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        double double13 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        double double15 = brentOptimizer0.getStartValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction16 = null;
        org.apache.commons.math.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = brentOptimizer0.optimize(univariateRealFunction16, goalType17, (double) 'a', (double) 10L, (double) '4');
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
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
        brentOptimizer0.setAbsoluteAccuracy(1.0E-14d);
        double double14 = brentOptimizer0.getFunctionValue();
        double double15 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
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
        double double13 = brentOptimizer0.getMin();
        double double14 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        double double7 = brentOptimizer0.getFunctionValue();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) -1);
        double double11 = brentOptimizer0.getRelativeAccuracy();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 1);
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getMax();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        int int13 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getMax();
        double double10 = brentOptimizer0.getMin();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        int int12 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (short) -1);
        int int15 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
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
        int int10 = brentOptimizer0.getMaxEvaluations();
        double double11 = brentOptimizer0.getMax();
        brentOptimizer0.setMaxEvaluations((int) ' ');
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
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
        brentOptimizer0.setRelativeAccuracy((double) '4');
        int int16 = brentOptimizer0.getMaxEvaluations();
        double double17 = brentOptimizer0.getAbsoluteAccuracy();
        double double18 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-10d + "'", double12 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-10d + "'", double17 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
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
        int int14 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 0);
        double double13 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        double double8 = brentOptimizer0.getMin();
        int int9 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) '#');
        int int8 = brentOptimizer0.getIterationCount();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        double double8 = brentOptimizer0.getStartValue();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
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
        double double14 = brentOptimizer0.getStartValue();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        int int8 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) 2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
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
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetRelativeAccuracy();
        double double13 = brentOptimizer0.getFunctionValue();
        double double14 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
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
        brentOptimizer0.resetRelativeAccuracy();
        int int13 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        brentOptimizer0.setRelativeAccuracy((double) '4');
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaxEvaluations((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int9 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int10 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
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
        int int11 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(35.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy(10.0d);
        brentOptimizer0.resetMaximalIterationCount();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 1.0f);
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setAbsoluteAccuracy(1.0E-14d);
        int int6 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
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
        int int13 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaxEvaluations(0);
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
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double10 = brentOptimizer0.getStartValue();
        int int11 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double11 = brentOptimizer0.getMin();
        int int12 = brentOptimizer0.getIterationCount();
        double double13 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        int int5 = brentOptimizer0.getMaxEvaluations();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        int int12 = brentOptimizer0.getMaxEvaluations();
        double double13 = brentOptimizer0.getStartValue();
        int int14 = brentOptimizer0.getEvaluations();
        double double15 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) '#');
        double double7 = brentOptimizer0.getFunctionValue();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        int int8 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        double double7 = brentOptimizer0.getFunctionValue();
        int int8 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations(52);
        double double11 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(100.0d);
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double5 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
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
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double15 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 100.0f);
        int int9 = brentOptimizer0.getMaximalIterationCount();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        double double13 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
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
        double double15 = brentOptimizer0.getStartValue();
        int int16 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 1);
        java.lang.Class<?> wildcardClass20 = brentOptimizer0.getClass();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        int int9 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) 10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        double double5 = brentOptimizer0.getMin();
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 1L);
        brentOptimizer0.resetAbsoluteAccuracy();
        int int10 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        double double6 = brentOptimizer0.getMax();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getMax();
        int int9 = brentOptimizer0.getIterationCount();
        java.lang.Class<?> wildcardClass10 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        int int5 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations(0);
        int int8 = brentOptimizer0.getMaxEvaluations();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getRelativeAccuracy();
        double double6 = brentOptimizer0.getMin();
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        brentOptimizer0.setRelativeAccuracy((-1.0d));
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-10d + "'", double12 == 1.0E-10d);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        int int9 = brentOptimizer0.getIterationCount();
        int int10 = brentOptimizer0.getIterationCount();
        double double11 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((-1));
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getRelativeAccuracy();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
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
        int int10 = brentOptimizer0.getEvaluations();
        double double11 = brentOptimizer0.getMin();
        double double12 = brentOptimizer0.getMin();
        int int13 = brentOptimizer0.getMaxEvaluations();
        double double14 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
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
        double double13 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        int int15 = brentOptimizer0.getMaxEvaluations();
        double double16 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
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
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction19 = null;
        org.apache.commons.math.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = brentOptimizer0.optimize(univariateRealFunction19, goalType20, (double) (byte) 10, (double) (short) -1, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getFunctionValue();
        int int11 = brentOptimizer0.getEvaluations();
        double double12 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }
}

