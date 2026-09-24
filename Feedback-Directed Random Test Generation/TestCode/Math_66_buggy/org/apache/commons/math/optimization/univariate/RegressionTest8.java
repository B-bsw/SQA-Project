package org.apache.commons.math.optimization.univariate;

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
        int int10 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) 0L);
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        double double12 = brentOptimizer0.getRelativeAccuracy();
        double double13 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
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
        int int12 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        double double4 = brentOptimizer0.getStartValue();
        double double5 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        int int12 = brentOptimizer0.getMaximalIterationCount();
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
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getRelativeAccuracy();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
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
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        brentOptimizer0.setAbsoluteAccuracy(97.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        brentOptimizer0.resetMaximalIterationCount();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) ' ');
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        double double4 = brentOptimizer0.getFunctionValue();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        int int9 = brentOptimizer0.getIterationCount();
        double double10 = brentOptimizer0.getMax();
        brentOptimizer0.setMaxEvaluations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
        double double10 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
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
        brentOptimizer0.setMaxEvaluations((int) '4');
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(1);
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double10 = brentOptimizer0.getMin();
        brentOptimizer0.resetRelativeAccuracy();
        double double12 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        int int2 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = brentOptimizer0.getGoalType();
        double double4 = brentOptimizer0.getStartValue();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.optimize(univariateRealFunction6, goalType7, (double) '4', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(10);
        int int9 = brentOptimizer0.getMaximalIterationCount();
        int int10 = brentOptimizer0.getEvaluations();
        int int11 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        double double6 = brentOptimizer0.getStartValue();
        java.lang.Class<?> wildcardClass7 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        double double8 = brentOptimizer0.getStartValue();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        double double12 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        double double14 = brentOptimizer0.getStartValue();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-10d + "'", double9 == 1.0E-10d);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double8 = brentOptimizer0.getMax();
        int int9 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((int) '#');
        double double10 = brentOptimizer0.getStartValue();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-10d + "'", double13 == 1.0E-10d);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        double double9 = brentOptimizer0.getMin();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, (double) 52, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        int int14 = brentOptimizer0.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        int int9 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 100.0f);
        double double9 = brentOptimizer0.getStartValue();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass11 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        int int10 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        brentOptimizer0.setMaximalIterationCount((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        int int9 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (short) 100);
        brentOptimizer0.resetAbsoluteAccuracy();
        double double13 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
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
        double double13 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
        double double13 = brentOptimizer0.getMax();
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
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
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
        double double12 = brentOptimizer0.getMin();
        brentOptimizer0.setRelativeAccuracy((double) (byte) -1);
        brentOptimizer0.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        double double17 = brentOptimizer0.getAbsoluteAccuracy();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-10d + "'", double17 == 1.0E-10d);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        double double12 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setMaximalIterationCount((int) (short) 1);
        brentOptimizer0.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 'a');
        int int13 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 100.0f);
        int int17 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
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
        int int12 = brentOptimizer0.getEvaluations();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double15 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getIterationCount();
        double double9 = brentOptimizer0.getMax();
        int int10 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, 1.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
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
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) 32);
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, (double) 100.0f, (double) ' ', 35.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) ' ');
        brentOptimizer0.setRelativeAccuracy((double) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        double double10 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass12 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        double double11 = brentOptimizer0.getFunctionValue();
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, (double) (-1L), 35.0d);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
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
        double double13 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
        brentOptimizer0.setRelativeAccuracy(10.0d);
        int int17 = brentOptimizer0.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        int int13 = brentOptimizer0.getMaximalIterationCount();
        int int14 = brentOptimizer0.getMaximalIterationCount();
        double double15 = brentOptimizer0.getMin();
        java.lang.Class<?> wildcardClass16 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getMax();
        double double10 = brentOptimizer0.getMax();
        int int11 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        int int12 = brentOptimizer0.getEvaluations();
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
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        int int13 = brentOptimizer0.getMaximalIterationCount();
        int int14 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        brentOptimizer0.setMaximalIterationCount(97);
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.getResult();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
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
        int int11 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) 35);
        brentOptimizer0.setMaxEvaluations(1);
        brentOptimizer0.setRelativeAccuracy((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        brentOptimizer0.resetRelativeAccuracy();
        int int15 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        double double19 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1L));
        double double9 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        int int9 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
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
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        double double5 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getEvaluations();
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(97.0d);
        double double12 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
        int int13 = brentOptimizer0.getMaxEvaluations();
        int int14 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaxEvaluations((int) '4');
        brentOptimizer0.setAbsoluteAccuracy((double) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        double double6 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 10);
        double double9 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, (double) 35, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        brentOptimizer0.setMaximalIterationCount(2147483647);
        double double13 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
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
        int int11 = brentOptimizer0.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
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
        double double13 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaximalIterationCount();
        double double8 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setAbsoluteAccuracy((double) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType5 = brentOptimizer0.getGoalType();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy(52.0d);
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        int int11 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
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
        int int12 = brentOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass13 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        double double13 = brentOptimizer0.getMax();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
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
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.optimize(univariateRealFunction7, goalType8, (double) 100L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
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
        brentOptimizer0.setAbsoluteAccuracy(97.0d);
        brentOptimizer0.setRelativeAccuracy((double) 100.0f);
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
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setAbsoluteAccuracy(1.0d);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        double double10 = brentOptimizer0.getMin();
        double double11 = brentOptimizer0.getFunctionValue();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 2147483647);
        double double9 = brentOptimizer0.getStartValue();
        brentOptimizer0.setRelativeAccuracy((double) 97);
        double double12 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        brentOptimizer0.setMaximalIterationCount((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.setAbsoluteAccuracy((-1.0d));
        brentOptimizer0.setAbsoluteAccuracy((double) 10);
        int int13 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        brentOptimizer0.setAbsoluteAccuracy(1.0E-14d);
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
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
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-10d + "'", double13 == 1.0E-10d);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 1L);
        brentOptimizer0.setAbsoluteAccuracy((double) 1);
        double double11 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) (short) 0);
        brentOptimizer0.setRelativeAccuracy((double) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        double double9 = brentOptimizer0.getMax();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int8 = brentOptimizer0.getMaxEvaluations();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int12 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        double double10 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        double double4 = brentOptimizer0.getFunctionValue();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        int int9 = brentOptimizer0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        brentOptimizer0.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        int int10 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        int int8 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        int int10 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.optimize(univariateRealFunction7, goalType8, 1.0E-14d, (double) 2147483647);
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
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
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
        brentOptimizer0.setMaxEvaluations(10);
        double double14 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaxEvaluations((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
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
        int int12 = brentOptimizer0.getEvaluations();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getMin();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        double double11 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, 0.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of evaluations (-1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
        int int14 = brentOptimizer0.getIterationCount();
        java.lang.Class<?> wildcardClass15 = brentOptimizer0.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
        brentOptimizer0.setAbsoluteAccuracy(10.0d);
        int int13 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMin();
        int int7 = brentOptimizer0.getMaximalIterationCount();
        double double8 = brentOptimizer0.getStartValue();
        double double9 = brentOptimizer0.getMin();
        int int10 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, (double) 0.0f, 97.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
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
        double double15 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
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
        brentOptimizer0.setRelativeAccuracy((double) 100);
        int int15 = brentOptimizer0.getMaximalIterationCount();
        int int16 = brentOptimizer0.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        int int8 = brentOptimizer0.getEvaluations();
        int int9 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, (double) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
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
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        double double12 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        double double4 = brentOptimizer0.getFunctionValue();
        int int5 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.optimize(univariateRealFunction6, goalType7, 1.0E-10d, (double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        double double7 = brentOptimizer0.getFunctionValue();
        int int8 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations(52);
        double double11 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setRelativeAccuracy((double) 1);
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getMin();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-10d + "'", double12 == 1.0E-10d);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        int int10 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-10d);
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-10d + "'", double13 == 1.0E-10d);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
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
        int int15 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 1);
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentOptimizer0.optimize(univariateRealFunction14, goalType15, (double) 52, 1.0E-10d, 10.0d);
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
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getMax();
        int int9 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        double double7 = brentOptimizer0.getMax();
        double double8 = brentOptimizer0.getMin();
        double double9 = brentOptimizer0.getMax();
        int int10 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
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
        double double16 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.optimization.GoalType goalType17 = brentOptimizer0.getGoalType();
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
        org.junit.Assert.assertNull(goalType17);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) -1);
        double double10 = brentOptimizer0.getStartValue();
        double double11 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.getResult();
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        double double6 = brentOptimizer0.getMax();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getMax();
        int int9 = brentOptimizer0.getMaxEvaluations();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
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
        brentOptimizer0.setAbsoluteAccuracy((double) 1);
        brentOptimizer0.setRelativeAccuracy(1.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) (short) 100);
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) -1);
        double double11 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(1);
        brentOptimizer0.setAbsoluteAccuracy((double) 97);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, (double) (-1L), (double) 52, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        double double8 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
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
        brentOptimizer0.setMaxEvaluations(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
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
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
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
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        double double14 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setAbsoluteAccuracy(10.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(10);
        int int9 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        int int11 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
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
        int int12 = brentOptimizer0.getEvaluations();
        int int13 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) '#');
        double double7 = brentOptimizer0.getFunctionValue();
        double double8 = brentOptimizer0.getStartValue();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass10 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getMax();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(2.147483647E9d);
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.147483647E9d + "'", double9 == 2.147483647E9d);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        int int6 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) (short) 100);
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-10d + "'", double9 == 1.0E-10d);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentOptimizer0.optimize(univariateRealFunction15, goalType16, (double) 0.0f, (double) (short) 0);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getStartValue();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, (double) 1L, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        int int8 = brentOptimizer0.getMaximalIterationCount();
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setAbsoluteAccuracy(1.0d);
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, (double) (short) 10, (double) 0L, 52.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 1);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaxEvaluations((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getStartValue();
        int int7 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        double double12 = brentOptimizer0.getStartValue();
        double double13 = brentOptimizer0.getStartValue();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
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
        double double13 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMin();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        double double10 = brentOptimizer0.getMin();
        double double11 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getFunctionValue();
        double double4 = brentOptimizer0.getStartValue();
        double double5 = brentOptimizer0.getRelativeAccuracy();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        double double7 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 0);
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (short) 1);
        double double11 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
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
        brentOptimizer0.resetAbsoluteAccuracy();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        double double8 = brentOptimizer0.getFunctionValue();
        double double9 = brentOptimizer0.getMax();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, 2.147483647E9d, (double) (short) 10, (double) 'a');
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
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
        brentOptimizer0.resetRelativeAccuracy();
        double double14 = brentOptimizer0.getStartValue();
        int int15 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        int int11 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int13 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
        int int13 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.setRelativeAccuracy((double) 97);
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        double double11 = brentOptimizer0.getMax();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setAbsoluteAccuracy(1.0d);
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        int int10 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations(32);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
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
        brentOptimizer0.setAbsoluteAccuracy((double) (short) -1);
        java.lang.Class<?> wildcardClass15 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.resetAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass11 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
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
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 2147483647);
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
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int10 = brentOptimizer0.getEvaluations();
        double double11 = brentOptimizer0.getStartValue();
        double double12 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        brentOptimizer0.setRelativeAccuracy((double) '4');
        brentOptimizer0.setRelativeAccuracy(100.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
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
        double double11 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, (double) (byte) 10, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.setMaximalIterationCount(10);
        brentOptimizer0.setMaxEvaluations(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
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
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getStartValue();
        int int2 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaxEvaluations(35);
        double double5 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
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
        double double13 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
            double double16 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, (double) '#', (double) 97);
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
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) '4');
        brentOptimizer0.setAbsoluteAccuracy((double) 97);
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
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        brentOptimizer0.setMaxEvaluations(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
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
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, (double) 100L, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getMax();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
        int int10 = brentOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass11 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        double double17 = brentOptimizer0.getFunctionValue();
        int int18 = brentOptimizer0.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        int int2 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(97);
        int int6 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
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
        brentOptimizer0.setMaximalIterationCount(52);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int17 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double9 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        double double12 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy(32.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        int int9 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) 10);
        int int9 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) (-1));
        brentOptimizer0.resetMaximalIterationCount();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        brentOptimizer0.setAbsoluteAccuracy((double) 100.0f);
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
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
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
        brentOptimizer0.setMaximalIterationCount(52);
        int int12 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
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
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, 1.0E-10d, (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
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
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
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
        brentOptimizer0.setRelativeAccuracy((double) '4');
        int int17 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
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
        brentOptimizer0.setMaximalIterationCount(100);
        brentOptimizer0.resetAbsoluteAccuracy();
        double double17 = brentOptimizer0.getMin();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
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
        double double12 = brentOptimizer0.getMin();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
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
        double double14 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        double double9 = brentOptimizer0.getRelativeAccuracy();
        int int10 = brentOptimizer0.getIterationCount();
        double double11 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetMaximalIterationCount();
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
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
        brentOptimizer0.setMaximalIterationCount(100);
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 0);
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
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
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
        double double11 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        double double8 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        int int10 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
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
        brentOptimizer0.setMaxEvaluations((int) (byte) 1);
        brentOptimizer0.setMaximalIterationCount(35);
        double double16 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) '#');
        double double7 = brentOptimizer0.getFunctionValue();
        double double8 = brentOptimizer0.getStartValue();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 1L);
        brentOptimizer0.setAbsoluteAccuracy((double) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getEvaluations();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        double double10 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
        brentOptimizer0.setAbsoluteAccuracy((double) 1L);
        int int13 = brentOptimizer0.getEvaluations();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.setMaxEvaluations(97);
        double double8 = brentOptimizer0.getFunctionValue();
        double double9 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        brentOptimizer0.setRelativeAccuracy((double) (-1));
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
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
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
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, (double) 0L, 1.0E-14d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
        double double13 = brentOptimizer0.getStartValue();
        int int14 = brentOptimizer0.getMaximalIterationCount();
        double double15 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.setMaxEvaluations(97);
        double double8 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        brentOptimizer0.resetRelativeAccuracy();
        int int13 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        double double9 = brentOptimizer0.getMin();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        int int11 = brentOptimizer0.getEvaluations();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        double double10 = brentOptimizer0.getFunctionValue();
        int int11 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 0);
        int int14 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
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
        brentOptimizer0.setMaximalIterationCount(100);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-10d + "'", double13 == 1.0E-10d);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
        brentOptimizer0.setMaxEvaluations(0);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 0);
        int int10 = brentOptimizer0.getEvaluations();
        double double11 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        double double12 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
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
        brentOptimizer0.setMaximalIterationCount(2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
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
        brentOptimizer0.setMaxEvaluations((int) '#');
        double double15 = brentOptimizer0.getFunctionValue();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
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
        double double11 = brentOptimizer0.getRelativeAccuracy();
        double double12 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        int int12 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        double double4 = brentOptimizer0.getStartValue();
        double double5 = brentOptimizer0.getFunctionValue();
        int int6 = brentOptimizer0.getIterationCount();
        double double7 = brentOptimizer0.getMin();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
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
        brentOptimizer0.setMaximalIterationCount(52);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10.0f);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getRelativeAccuracy();
        double double6 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass8 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
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
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentOptimizer0.doOptimize();
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
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        double double5 = brentOptimizer0.getStartValue();
        brentOptimizer0.setAbsoluteAccuracy((double) 10.0f);
        int int8 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
        double double15 = brentOptimizer0.getStartValue();
        double double16 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        int int5 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations(0);
        double double8 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.optimize(univariateRealFunction8, goalType9, 97.0d, 1.0E-14d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations(1);
        brentOptimizer0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass10 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getEvaluations();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
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
        double double15 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(1);
        int int8 = brentOptimizer0.getIterationCount();
        int int9 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double3 = brentOptimizer0.getMin();
        double double4 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
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
        int int14 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        int int9 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
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
        int int18 = brentOptimizer0.getMaximalIterationCount();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        brentOptimizer0.setRelativeAccuracy((double) 1.0f);
        double double14 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        int int5 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations(35);
        int int9 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, (double) 'a', (double) 100, 52.0d);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
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
        brentOptimizer0.resetMaximalIterationCount();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount(35);
        double double8 = brentOptimizer0.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
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
        double double13 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) ' ');
        double double10 = brentOptimizer0.getMax();
        int int11 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.setMaxEvaluations((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
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
        double double14 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 100.0f);
        double double9 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getMax();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        double double8 = brentOptimizer0.getFunctionValue();
        double double9 = brentOptimizer0.getMin();
        int int10 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.optimize(univariateRealFunction6, goalType7, (double) 97, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
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
        double double15 = brentOptimizer0.getAbsoluteAccuracy();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
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
        org.apache.commons.math.optimization.GoalType goalType17 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType17);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
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
        double double14 = brentOptimizer0.getStartValue();
        org.apache.commons.math.optimization.GoalType goalType15 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getMax();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(2.147483647E9d);
        double double9 = brentOptimizer0.getFunctionValue();
        int int10 = brentOptimizer0.getMaxEvaluations();
        double double11 = brentOptimizer0.getMax();
        brentOptimizer0.setMaxEvaluations((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass6 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getMin();
        double double8 = brentOptimizer0.getMax();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        int int11 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass11 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        brentOptimizer0.setAbsoluteAccuracy((double) 1L);
        int int12 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMin();
        double double7 = brentOptimizer0.getStartValue();
        int int8 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        double double7 = brentOptimizer0.getMin();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 0);
        int int10 = brentOptimizer0.getEvaluations();
        double double11 = brentOptimizer0.getMin();
        int int12 = brentOptimizer0.getMaxEvaluations();
        int int13 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
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
        brentOptimizer0.setMaximalIterationCount((int) (short) -1);
        brentOptimizer0.setMaxEvaluations((int) ' ');
        double double15 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.setAbsoluteAccuracy((double) 0L);
        brentOptimizer0.setRelativeAccuracy((double) (-1.0f));
        brentOptimizer0.setMaximalIterationCount(32);
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
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
        brentOptimizer0.setMaxEvaluations(10);
        double double14 = brentOptimizer0.getStartValue();
        int int15 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getFunctionValue();
        int int4 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) 100.0f);
        double double7 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.optimize(univariateRealFunction8, goalType9, (double) (short) 0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.setRelativeAccuracy((double) 97);
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 1);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy((double) 10.0f);
        double double11 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        int int13 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.optimize(univariateRealFunction14, goalType15, (-1.0d), (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
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
        double double13 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMax();
        int int7 = brentOptimizer0.getMaximalIterationCount();
        int int8 = brentOptimizer0.getIterationCount();
        int int9 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        int int2 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = brentOptimizer0.getGoalType();
        double double4 = brentOptimizer0.getRelativeAccuracy();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        double double7 = brentOptimizer0.getFunctionValue();
        double double8 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        brentOptimizer0.resetMaximalIterationCount();
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations(97);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int13 = brentOptimizer0.getEvaluations();
        int int14 = brentOptimizer0.getEvaluations();
        int int15 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(1);
        brentOptimizer0.setAbsoluteAccuracy((double) 100.0f);
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaxEvaluations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((int) '#');
        double double10 = brentOptimizer0.getStartValue();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        double double12 = brentOptimizer0.getFunctionValue();
        int int13 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
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
        int int17 = brentOptimizer0.getIterationCount();
        int int18 = brentOptimizer0.getMaxEvaluations();
        int int19 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double5 = brentOptimizer0.getStartValue();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
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
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        double double13 = brentOptimizer0.getFunctionValue();
        double double14 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-10d + "'", double12 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        double double4 = brentOptimizer0.getStartValue();
        double double5 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetMaximalIterationCount();
        double double7 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaxEvaluations((int) '#');
        double double10 = brentOptimizer0.getRelativeAccuracy();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        double double10 = brentOptimizer0.getFunctionValue();
        double double11 = brentOptimizer0.getFunctionValue();
        double double12 = brentOptimizer0.getFunctionValue();
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        int int14 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentOptimizer0.optimize(univariateRealFunction15, goalType16, (double) (short) 100, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-10d + "'", double13 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
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
        int int12 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        brentOptimizer0.resetRelativeAccuracy();
        double double11 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
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
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, (double) '#', (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
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
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        int int13 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(1);
        brentOptimizer0.setAbsoluteAccuracy((double) 97);
        brentOptimizer0.setAbsoluteAccuracy(97.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.optimize(univariateRealFunction14, goalType15, (double) (-1L), (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
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
        brentOptimizer0.setMaximalIterationCount(52);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(10.0d);
        int int10 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
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
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        double double7 = brentOptimizer0.getStartValue();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        int int9 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getMax();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaxEvaluations((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
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
        brentOptimizer0.setMaxEvaluations((int) 'a');
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        org.apache.commons.math.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = brentOptimizer0.optimize(univariateRealFunction17, goalType18, (double) (short) 0, 0.0d, (double) 10L);
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
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
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
        brentOptimizer0.setRelativeAccuracy((double) 10L);
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass14 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
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
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
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
        int int12 = brentOptimizer0.getIterationCount();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
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
        brentOptimizer0.setAbsoluteAccuracy(52.0d);
        brentOptimizer0.setMaximalIterationCount(52);
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
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
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
        brentOptimizer0.setRelativeAccuracy((double) 0);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
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
        brentOptimizer0.setMaxEvaluations((int) (short) 100);
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
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        brentOptimizer0.resetMaximalIterationCount();
        int int9 = brentOptimizer0.getIterationCount();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        java.lang.Class<?> wildcardClass11 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
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
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        java.lang.Class<?> wildcardClass15 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getMin();
        double double9 = brentOptimizer0.getFunctionValue();
        double double10 = brentOptimizer0.getMin();
        java.lang.Class<?> wildcardClass11 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(1);
        brentOptimizer0.setAbsoluteAccuracy((double) 97);
        brentOptimizer0.resetAbsoluteAccuracy();
        int int11 = brentOptimizer0.getMaxEvaluations();
        int int12 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        double double6 = brentOptimizer0.getMax();
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
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
        double double18 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 1);
        brentOptimizer0.setRelativeAccuracy((double) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
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
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        int int13 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-10d + "'", double12 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy(1.0E-10d);
        brentOptimizer0.setMaximalIterationCount((-1));
        double double14 = brentOptimizer0.getMin();
        int int15 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setMaximalIterationCount(0);
        double double7 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 1);
        int int10 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        double double12 = brentOptimizer0.getMax();
        double double13 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy(10.0d);
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        brentOptimizer0.setRelativeAccuracy((double) (short) 1);
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, 0.0d, (double) 97, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        int int8 = brentOptimizer0.getEvaluations();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        double double11 = brentOptimizer0.getMax();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        double double14 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-10d + "'", double9 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        double double7 = brentOptimizer0.getFunctionValue();
        int int8 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations(52);
        double double11 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        double double14 = brentOptimizer0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass15 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) ' ');
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
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
        double double13 = brentOptimizer0.getMax();
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
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        double double14 = brentOptimizer0.getStartValue();
        brentOptimizer0.setRelativeAccuracy((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        int int5 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 1);
        int int10 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getIterationCount();
        int int9 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (short) 1);
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getStartValue();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount(0);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
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
        double double14 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        double double19 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getMax();
        double double10 = brentOptimizer0.getMax();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(100);
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setMaximalIterationCount(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
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
        double double14 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        int int7 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setAbsoluteAccuracy(1.0d);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        double double9 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
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
        double double11 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-10d + "'", double14 == 1.0E-10d);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaxEvaluations(0);
        int int9 = brentOptimizer0.getEvaluations();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        double double11 = brentOptimizer0.getFunctionValue();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-10d + "'", double12 == 1.0E-10d);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 10L);
        double double10 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int11 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 1);
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
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
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        int int14 = brentOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-10d + "'", double13 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        double double5 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.setAbsoluteAccuracy((-1.0d));
        brentOptimizer0.setAbsoluteAccuracy((double) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
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
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
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
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, 52.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) '#');
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount(52);
        int int10 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
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
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 0);
        double double18 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-14d + "'", double18 == 1.0E-14d);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        int int9 = brentOptimizer0.getEvaluations();
        double double10 = brentOptimizer0.getStartValue();
        double double11 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
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
        double double14 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double17 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
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
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        int int15 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 1);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass12 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
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
        double double12 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
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
        double double12 = brentOptimizer0.getMin();
        int int13 = brentOptimizer0.getIterationCount();
        double double14 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        int int11 = brentOptimizer0.getMaxEvaluations();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        double double15 = brentOptimizer0.getMin();
        double double16 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getMin();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, 1.0d, (double) (short) 1);
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
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
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
        double double13 = brentOptimizer0.getStartValue();
        int int14 = brentOptimizer0.getMaximalIterationCount();
        int int15 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetRelativeAccuracy();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
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
        brentOptimizer0.setMaximalIterationCount(0);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
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
        double double14 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        double double7 = brentOptimizer0.getFunctionValue();
        int int8 = brentOptimizer0.getIterationCount();
        double double9 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
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
        double double13 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-10d + "'", double12 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
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
        double double13 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getStartValue();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1.0f));
        brentOptimizer0.setAbsoluteAccuracy((double) 1);
        brentOptimizer0.setAbsoluteAccuracy((double) 0);
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 1);
        int int12 = brentOptimizer0.getMaximalIterationCount();
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(32.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1L));
        double double9 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations(1);
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, (double) 52, 0.0d, (double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
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
        double double11 = brentOptimizer0.getMin();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
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
        brentOptimizer0.setRelativeAccuracy(97.0d);
        int int14 = brentOptimizer0.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
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
        double double13 = brentOptimizer0.getMin();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getStartValue();
        double double10 = brentOptimizer0.getFunctionValue();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setMaximalIterationCount(0);
        double double7 = brentOptimizer0.getStartValue();
        int int8 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.optimize(univariateRealFunction8, goalType9, (double) 52, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
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
        int int12 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double7 = brentOptimizer0.getFunctionValue();
        int int8 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
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
        double double15 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetAbsoluteAccuracy();
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
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        double double9 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, (double) (short) 0, (double) (byte) 10, (double) (short) 100);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
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
        int int18 = brentOptimizer0.getEvaluations();
        double double19 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) ' ');
        brentOptimizer0.setMaxEvaluations(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        int int6 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        double double5 = brentOptimizer0.getStartValue();
        double double6 = brentOptimizer0.getMin();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        double double9 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        double double11 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        double double3 = brentOptimizer0.getStartValue();
        int int4 = brentOptimizer0.getIterationCount();
        int int5 = brentOptimizer0.getMaxEvaluations();
        double double6 = brentOptimizer0.getStartValue();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction19 = null;
        org.apache.commons.math.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = brentOptimizer0.optimize(univariateRealFunction19, goalType20, (double) 100, (double) 0.0f, (double) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
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
        int int17 = brentOptimizer0.getIterationCount();
        double double18 = brentOptimizer0.getMin();
        double double19 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
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
        double double11 = brentOptimizer0.getStartValue();
        double double12 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        double double5 = brentOptimizer0.getRelativeAccuracy();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
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
        brentOptimizer0.resetRelativeAccuracy();
        int int12 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getMin();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        int int11 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaxEvaluations(10);
        double double9 = brentOptimizer0.getStartValue();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) ' ');
        double double11 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaxEvaluations(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
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
        brentOptimizer0.resetRelativeAccuracy();
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
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        double double10 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getStartValue();
        double double10 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int12 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        brentOptimizer0.resetMaximalIterationCount();
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
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
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
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
        double double19 = brentOptimizer0.getRelativeAccuracy();
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
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
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
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
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getEvaluations();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        int int10 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
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
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-10d + "'", double14 == 1.0E-10d);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
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
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 1);
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getMax();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, (double) '#', 35.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
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
        double double15 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-10d + "'", double15 == 1.0E-10d);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 100.0f);
        double double9 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) 35);
        brentOptimizer0.setAbsoluteAccuracy((double) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        int int9 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
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
        brentOptimizer0.resetMaximalIterationCount();
        double double14 = brentOptimizer0.getMin();
        int int15 = brentOptimizer0.getEvaluations();
        double double16 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        double double9 = brentOptimizer0.getMin();
        double double10 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        int int2 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        double double4 = brentOptimizer0.getMax();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.optimize(univariateRealFunction5, goalType6, (double) 0L, (double) ' ', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
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
        brentOptimizer0.setMaximalIterationCount(0);
        int int14 = brentOptimizer0.getEvaluations();
        double double15 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int10 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
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
        double double15 = brentOptimizer0.getFunctionValue();
        double double16 = brentOptimizer0.getMin();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType5 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = goalType6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
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
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
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
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
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
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        double double17 = brentOptimizer0.getMin();
        org.apache.commons.math.optimization.GoalType goalType18 = brentOptimizer0.getGoalType();
        double double19 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(goalType18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 100L);
        double double10 = brentOptimizer0.getMax();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        brentOptimizer0.setMaxEvaluations(97);
        int int15 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
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
        double double15 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 1L);
        org.apache.commons.math.optimization.GoalType goalType18 = brentOptimizer0.getGoalType();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNull(goalType18);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        brentOptimizer0.resetMaximalIterationCount();
        int int9 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
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
        int int14 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (short) 10);
        int int17 = brentOptimizer0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
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
        double double15 = brentOptimizer0.getStartValue();
        int int16 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
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
        double double12 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.setAbsoluteAccuracy((double) 52);
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
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
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) (short) 1);
        double double20 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction21 = null;
        org.apache.commons.math.optimization.GoalType goalType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = brentOptimizer0.optimize(univariateRealFunction21, goalType22, (double) (-1.0f), (double) 32);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        int int8 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
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
        brentOptimizer0.setAbsoluteAccuracy((double) 1);
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
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
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
        brentOptimizer0.setRelativeAccuracy((double) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double11 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
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
        brentOptimizer0.setRelativeAccuracy((double) (short) 0);
        brentOptimizer0.setRelativeAccuracy((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
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
        double double11 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
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
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy(1.0E-14d);
        double double10 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
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
        int int11 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations(97);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int13 = brentOptimizer0.getEvaluations();
        int int14 = brentOptimizer0.getEvaluations();
        double double15 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) '#');
        brentOptimizer0.setMaxEvaluations(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 100);
        brentOptimizer0.resetRelativeAccuracy();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
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
        brentOptimizer0.resetMaximalIterationCount();
        int int13 = brentOptimizer0.getMaximalIterationCount();
        int int14 = brentOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.getResult();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
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
        int int16 = brentOptimizer0.getIterationCount();
        double double17 = brentOptimizer0.getMax();
        double double18 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-10d + "'", double18 == 1.0E-10d);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMax();
        int int7 = brentOptimizer0.getMaximalIterationCount();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.optimize(univariateRealFunction6, goalType7, (double) 0L, 32.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        int int9 = brentOptimizer0.getIterationCount();
        int int10 = brentOptimizer0.getIterationCount();
        double double11 = brentOptimizer0.getMin();
        brentOptimizer0.setRelativeAccuracy((double) 10);
        int int14 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        int int8 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) ' ');
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy(2.147483647E9d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (short) -1);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
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
        brentOptimizer0.setMaxEvaluations((-1));
        double double14 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) -1);
        double double10 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        brentOptimizer0.setAbsoluteAccuracy((double) 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getIterationCount();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        double double7 = brentOptimizer0.getMax();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((int) ' ');
        java.lang.Class<?> wildcardClass11 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
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
        brentOptimizer0.setAbsoluteAccuracy((double) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
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
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
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
        double double11 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        double double13 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
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
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
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
        double double11 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        double double13 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        double double9 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
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
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((int) '#');
        double double10 = brentOptimizer0.getStartValue();
        double double11 = brentOptimizer0.getStartValue();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        int int13 = brentOptimizer0.getIterationCount();
        int int14 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount(100);
        double double9 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
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
        double double13 = brentOptimizer0.getRelativeAccuracy();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
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
        double double11 = brentOptimizer0.getFunctionValue();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getStartValue();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 1);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int11 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) 0L);
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        double double15 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setMaximalIterationCount(0);
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        brentOptimizer0.setRelativeAccuracy((double) (byte) 1);
        int int12 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
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
        brentOptimizer0.setMaximalIterationCount(97);
        double double18 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double7 = brentOptimizer0.getRelativeAccuracy();
        int int8 = brentOptimizer0.getIterationCount();
        double double9 = brentOptimizer0.getFunctionValue();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
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
        int int11 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
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
        double double12 = brentOptimizer0.getFunctionValue();
        int int13 = brentOptimizer0.getIterationCount();
        double double14 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
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
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        org.apache.commons.math.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = brentOptimizer0.optimize(univariateRealFunction17, goalType18, (double) 100, 2.147483647E9d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 100);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        int int12 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        int int15 = brentOptimizer0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
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
        double double11 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        int int14 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType15 = brentOptimizer0.getGoalType();
        double double16 = brentOptimizer0.getStartValue();
        double double17 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
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
        int int11 = brentOptimizer0.getMaxEvaluations();
        int int12 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
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
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        double double15 = brentOptimizer0.getMin();
        int int16 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        org.apache.commons.math.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = brentOptimizer0.optimize(univariateRealFunction17, goalType18, (double) (short) 100, (double) 1, (double) (short) 100);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
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
        int int11 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getMin();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((-1.0d));
        double double13 = brentOptimizer0.getMin();
        double double14 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getFunctionValue();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10);
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getStartValue();
        int int2 = brentOptimizer0.getIterationCount();
        double double3 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentOptimizer0.optimize(univariateRealFunction4, goalType5, (double) 10.0f, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
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
        brentOptimizer0.setMaxEvaluations(10);
        int int15 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
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
        double double14 = brentOptimizer0.getStartValue();
        double double15 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 100);
        int int11 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
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
        int int11 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        double double15 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 2147483647);
        double double9 = brentOptimizer0.getStartValue();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        double double7 = brentOptimizer0.getMax();
        int int8 = brentOptimizer0.getMaxEvaluations();
        double double9 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        double double4 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        int int7 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
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
        double double15 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-10d + "'", double15 == 1.0E-10d);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getRelativeAccuracy();
        double double6 = brentOptimizer0.getMin();
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        brentOptimizer0.setRelativeAccuracy((double) 1L);
        brentOptimizer0.setRelativeAccuracy((double) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 0);
        int int10 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 'a');
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        int int5 = brentOptimizer0.getMaxEvaluations();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getMin();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
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
        double double10 = brentOptimizer0.getMax();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, 52.0d, 32.0d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getEvaluations();
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.optimize(univariateRealFunction9, goalType10, (double) 1.0f, (double) (short) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) 1.0f);
        java.lang.Class<?> wildcardClass10 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
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
        brentOptimizer0.resetRelativeAccuracy();
        int int13 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        int int15 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        int int9 = brentOptimizer0.getEvaluations();
        double double10 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((int) ' ');
        double double8 = brentOptimizer0.getMax();
        int int9 = brentOptimizer0.getIterationCount();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 'a');
        int int13 = brentOptimizer0.getMaxEvaluations();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 100);
        double double17 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
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
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
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
        double double13 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) ' ');
        int int10 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
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
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, (double) 0L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
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
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
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
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 100.0f);
        brentOptimizer0.setMaxEvaluations((int) 'a');
        int int10 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
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
        int int16 = brentOptimizer0.getIterationCount();
        double double17 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 100);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        int int12 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        double double15 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getMin();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType9);
    }
}

