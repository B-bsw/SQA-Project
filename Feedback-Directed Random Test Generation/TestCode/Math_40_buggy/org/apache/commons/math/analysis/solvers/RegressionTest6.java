package org.apache.commons.math.analysis.solvers;

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
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100, (int) '4');
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', 32);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (double) 0, (double) (byte) 100, 100);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 52, 10);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve((int) '#', univariateFunction7, (double) '#', 0.0d, (double) 100.0f, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (double) 100, (double) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), (double) 100L, 0.0d, 97);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) 52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        double double4 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver0.getMin();
        int int6 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (double) 100, (int) '#');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve((int) (byte) 0, univariateFunction5, (double) (short) -1, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), 35.0d, (int) '#');
        java.lang.Class<?> wildcardClass4 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction10, 10.0d, (double) '4', allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(35.0d, (int) '#');
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 1.0E-14d, (double) (-1.0f), (int) (byte) 10);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction11, (double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver3.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver3.solve((int) '4', univariateFunction11, (double) 'a', 32.0d, allowedSolution14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', 35.0d, 1.0E-6d, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getStartValue();
        double double7 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100, 1.0E-15d, 35);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction6, (double) '4', (double) ' ', allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getStartValue();
        int int5 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver0.solve((int) (short) 1, univariateFunction7, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, (int) (short) 100);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) ' ', univariateFunction8, 32.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 0.0d, (int) (byte) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve(100, univariateFunction5, (double) 10.0f, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getMax();
        double double12 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction14, (double) 1, (double) 0, allowedSolution17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(10.0d, 100.0d, (double) (byte) 100, 10);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getMax();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) (byte) 10, (double) (byte) 10, (int) ' ');
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve(52, univariateFunction8, 32.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', 100);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve((-1), univariateFunction7, (double) (short) -1, (double) (short) 1, 1.0E-15d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass12 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 0.0d, (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver3.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve((int) (short) 10, univariateFunction8, (double) (short) 0, 35.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', 100);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction11, 1.0E-15d, (double) 100L, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int8 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double11 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction5, (double) 32, 5.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, (int) ' ');
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, (double) 100.0f, 97);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) ' ');
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve(35, univariateFunction6, (double) (-1.0f), (double) 10L, (double) 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 1.0d, 97);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(100.0d, (int) (byte) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction4, (double) 0, (double) 52, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        java.lang.Class<?> wildcardClass9 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, 1.0E-6d, (int) '#');
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve(10, univariateFunction7, (double) 100.0f, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction6, 0.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) 10.0f, 100);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve((int) (byte) 100, univariateFunction7, (-1.0d), 35.0d, (double) 1L, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (double) (byte) 0, 0.0d, (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) 35, (double) 1L, 100);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1.0f), 100.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        java.lang.Class<?> wildcardClass11 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction12, (double) 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) 97, (int) '#');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver3.solve(100, univariateFunction5, (double) 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) 100, (double) 'a', 10);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        double double7 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double13 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int14 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double2 = bracketingNthOrderBrentSolver0.getMax();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getStartValue();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver0.getStartValue();
        double double8 = bracketingNthOrderBrentSolver0.getMax();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (double) (-1), 1.0d, 100);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve(100, univariateFunction8, (double) (byte) 100, (double) ' ', 97.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (double) (short) 100, (double) (short) 1, 52);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) 97, (int) '#');
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) (short) 10, univariateFunction6, 0.0d, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, 97.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(97, univariateFunction10, (double) ' ', (double) 5, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction5, (-1.0d), 1.0E-14d, (double) (-1), allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 0.0d, (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass7 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 100.0d, (double) 100, 32);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (int) (short) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction4, (double) 100, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, 0.0d, 32.0d, 97);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) 10, (int) '#');
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction10, (double) 32, (double) (short) 1, (double) 52, allowedSolution14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, 97);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((-1), univariateFunction5, (double) 100L, (double) 100, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, (double) (-1.0f), (double) (-1), 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', 0.0d, 1.0E-14d, (int) '4');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver4.solve(10, univariateFunction6, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (-1.0d), 10);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (double) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        double double6 = bracketingNthOrderBrentSolver3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double12 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve((int) (short) -1, univariateFunction6, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction10, (double) (short) 10, (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) (short) 0, (double) 1.0f, (int) (short) 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) 100, (double) 'a', 10);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getStartValue();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver4.solve((int) (short) 1, univariateFunction10, (double) (short) 100, (double) '#', (double) 100, allowedSolution14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        double double11 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, (double) ' ', 52);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve(0, univariateFunction6, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', 0.0d, 52);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, 52.0d, (int) (byte) 100);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getMax();
        double double12 = bracketingNthOrderBrentSolver2.getMax();
        double double13 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, 52);
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction5, (double) 35, 0.0d, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), (double) 97, (double) '#', (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver0.getStartValue();
        double double7 = bracketingNthOrderBrentSolver0.getStartValue();
        double double8 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1.0f), 10);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction5, 32.0d, (double) 100.0f, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, 5);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((-1), univariateFunction5, 100.0d, (-1.0d), (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, 97);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        java.lang.Class<?> wildcardClass11 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (double) (-1.0f), 32);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100.0f, (double) 1L, (int) (byte) 10);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 0, (double) 10, (double) (byte) 100, 32);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.solve((int) (short) 10, univariateFunction6, (double) 1L, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getMin();
        int int7 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, 0.0d, 52);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((-1), univariateFunction4, 1.0E-15d, (double) ' ', (double) (byte) -1, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, 100);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve(97, univariateFunction7, (double) '#', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        double double11 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction14, (double) 1.0f, (double) 1L, allowedSolution17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass13 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (double) 0.0f, (double) 5, 100);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        double double6 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int8 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve(100, univariateFunction10, 52.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(10.0d, 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, 97);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, 1.0d, (int) (byte) 10);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getStartValue();
        int int13 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve(35, univariateFunction15, (double) (short) 0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction7, 97.0d, 100.0d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        int int4 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver0.solve((int) (byte) 1, univariateFunction8, (double) 0, (double) (byte) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, 1.0E-14d, 35);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double13 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double14 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double15 = bracketingNthOrderBrentSolver2.getMax();
        java.lang.Class<?> wildcardClass16 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double2 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass4 = bracketingNthOrderBrentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', 100);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction5, (double) ' ', 1.0d, (double) 0.0f, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, (double) 0.0f, 0.0d, 35);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) '#', 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (double) 5, (double) 1L, 100);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve(100, univariateFunction7, 1.0E-15d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve(35, univariateFunction4, (double) (short) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) 1.0f, (int) ' ');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) 'a', (int) (short) 10);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        double double6 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver3.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver3.solve((int) '#', univariateFunction9, 1.0E-14d, (double) 'a', allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) (short) 100, (double) (short) 1, (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver4.solve(1, univariateFunction9, 35.0d, 97.0d, (double) 'a', allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, (double) (short) 10, (double) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1.0f), (double) (-1), (double) (short) -1, 100);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve((int) '#', univariateFunction8, 35.0d, (double) '#', allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (double) (byte) 0, 0.0d, (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        java.lang.Class<?> wildcardClass8 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) 5, (double) (short) 100, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve(1, univariateFunction8, (double) 0L, 0.0d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (double) ' ', (double) 0, 100);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver3.getMax();
        double double8 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) (byte) 100, (double) ' ', (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (double) 100L, (int) '4');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass7 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1L, (int) (short) 10);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, 100);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction9, (double) (-1.0f), (double) 32, 1.0d, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver3.getMax();
        int int8 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', 0.0d, 52);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (int) '#');
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction6, (double) 5, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        double double12 = bracketingNthOrderBrentSolver2.getMin();
        double double13 = bracketingNthOrderBrentSolver2.getStartValue();
        int int14 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double15 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction10, (double) 35, (-1.0d), allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1.0f, 52.0d, 35.0d, 35);
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getMin();
        double double7 = bracketingNthOrderBrentSolver3.getMin();
        java.lang.Class<?> wildcardClass8 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (double) (short) 100, (double) (short) 1, 52);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve((int) (short) -1, univariateFunction8, (double) 10L, (double) 10L, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int11 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) '4', univariateFunction13, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, 97);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) 'a', (int) (short) 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve(52, univariateFunction6, (double) 100L, (double) 1L, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver0.getMax();
        double double8 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver0.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver0.solve(1, univariateFunction11, (double) (short) 100, (double) 32, allowedSolution14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction7, 32.0d, 5.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getMin();
        double double12 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int13 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getStartValue();
        double double13 = bracketingNthOrderBrentSolver2.getMax();
        double double14 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double15 = bracketingNthOrderBrentSolver2.getMax();
        double double16 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double17 = bracketingNthOrderBrentSolver2.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-15d + "'", double16 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getMax();
        double double13 = bracketingNthOrderBrentSolver2.getStartValue();
        java.lang.Class<?> wildcardClass14 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 100);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 100.0d, (double) 100, 32);
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction11, (double) 'a', (double) (byte) -1, 0.0d, allowedSolution15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) (byte) 100, (double) (byte) 10, (int) '4');
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass7 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) '#');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction12, 100.0d, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1.0f), 1.0d, (double) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction8, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (int) '4');
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction8, 0.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve(100, univariateFunction8, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1.0f), (double) 5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction5, (double) (short) 10, (double) 10, (double) 35, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction3 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver0.solve((int) 'a', univariateFunction3, (double) 1.0f, 1.0E-15d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int11 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double12 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction14, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction8, (double) (-1L), 5.0d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 52, 10);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        double double6 = bracketingNthOrderBrentSolver3.getStartValue();
        java.lang.Class<?> wildcardClass7 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', 32);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) '4', (int) (byte) 100);
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) '#');
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction8, 35.0d, 52.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (int) (short) 100);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100, 100.0d, (double) 32, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) (byte) 100, 1.0E-6d, (int) (short) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) (byte) 100, univariateFunction6, (double) (-1L), 5.0d, (double) (byte) 10, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction10, 97.0d, 10.0d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, 1.0d, (int) (byte) 10);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (short) 0, univariateFunction6, (double) 52, (double) '#', (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(52.0d, (double) 0L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction12, 100.0d, (double) 97, allowedSolution15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 35);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) (byte) 100, (double) (byte) 10, (int) '4');
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, (double) 10, (double) (short) -1, (int) (short) 10);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', 100);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(35, univariateFunction5, (double) 1L, (double) 35, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass12 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (double) 0.0f, (double) 5, 100);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        double double6 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int8 = bracketingNthOrderBrentSolver4.getEvaluations();
        int int9 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        java.lang.Class<?> wildcardClass10 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        double double7 = bracketingNthOrderBrentSolver4.getMin();
        int int8 = bracketingNthOrderBrentSolver4.getEvaluations();
        int int9 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) ' ', univariateFunction11, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', 0.0d, 52);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction13, 100.0d, 1.0d, allowedSolution16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double11 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass12 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 100);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        java.lang.Class<?> wildcardClass12 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction9, (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, (int) ' ');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((int) '#', univariateFunction4, 1.0E-15d, 32.0d, 0.0d, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getStartValue();
        double double13 = bracketingNthOrderBrentSolver2.getMax();
        double double14 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) -1, (double) 1, 100);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction13, 1.0d, (double) 97, allowedSolution16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int12 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int13 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double14 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double15 = bracketingNthOrderBrentSolver2.getMax();
        java.lang.Class<?> wildcardClass16 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-15d + "'", double14 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, (double) 1, (int) (byte) 10);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.0d + "'", double4 == 5.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        int int4 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver0.solve((int) (byte) 10, univariateFunction7, (double) 32, 35.0d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, (double) 'a', (double) 5, 10);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 10.0d, (double) (byte) 10, 10);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, (double) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', 100);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int12 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction14, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver4.getMax();
        double double10 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double11 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double12 = bracketingNthOrderBrentSolver4.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver4.solve((int) (short) 1, univariateFunction14, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 52, 10);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve(0, univariateFunction6, (double) 10, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(52.0d, (int) (short) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction4, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (double) 100L, (int) '4');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve(1, univariateFunction5, (double) 100.0f, (double) (byte) -1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 0.0d, (int) '4');
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) '#', univariateFunction6, (double) '4', 0.0d, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, 97);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction4, (double) (-1L), 52.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100.0f, 0.0d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, (double) 35, (double) 97, 5);
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, (double) (short) 10, (double) 32, 32);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.solve((int) (short) 10, univariateFunction6, (double) 0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1.0f, 1.0E-14d, (double) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (-1.0f), (double) (byte) -1, 10);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double3 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver0.getMin();
        int int5 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver0.solve(1, univariateFunction7, 97.0d, 0.0d, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), 10);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 32.0d, (int) (byte) 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, 10.0d, 52);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, 1.0E-15d, (double) 1L, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(10.0d, (double) 0.0f, (double) 1.0f, (int) '#');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.solve((int) (short) 0, univariateFunction6, (double) '#', 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver0.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (double) (-1.0f), 32);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve((int) '4', univariateFunction5, (double) (short) -1, (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100, 1.0E-6d, (double) 97, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (double) (byte) 0, (double) (short) 0, 52);
        double double5 = bracketingNthOrderBrentSolver4.getStartValue();
        double double6 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', (double) 0L, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve((int) (short) 1, univariateFunction6, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100.0f, 97);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (double) 35, (double) (short) 0, (int) 'a');
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, (double) 1.0f, 100);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver3.getMax();
        double double8 = bracketingNthOrderBrentSolver3.getMax();
        double double9 = bracketingNthOrderBrentSolver3.getMax();
        double double10 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double11 = bracketingNthOrderBrentSolver3.getMax();
        double double12 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double13 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bracketingNthOrderBrentSolver3.solve(0, univariateFunction15, (double) 1.0f, (double) 10L, allowedSolution18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1L, (double) 0, (double) 100L, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(1, univariateFunction7, (double) 10.0f, (double) 0.0f, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int12 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int13 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction15, (double) 10L, (double) 5, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(35, univariateFunction10, (double) (short) 0, 52.0d, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, 5);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction4, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, 32);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int12 = bracketingNthOrderBrentSolver2.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        double double12 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int13 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (int) (byte) 10);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, (int) '4');
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve(32, univariateFunction6, 0.0d, (double) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((-1), univariateFunction7, (double) 32, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100.0f, 5);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, 100);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double2 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int3 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int4 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100, 10);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (int) (short) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) (short) 0, univariateFunction7, 32.0d, (double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) (short) 100, (double) (short) 1, (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        double double6 = bracketingNthOrderBrentSolver4.getMax();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100.0f, (double) 52, 97);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) (byte) 1, univariateFunction5, (-1.0d), (double) 1L, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (double) 10, (double) (byte) 1, 52);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.solve((int) ' ', univariateFunction6, (double) 0L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 0.0d, 10);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction10, 52.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) 1L, 100);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, 97.0d, (int) '4');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getStartValue();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (short) -1, univariateFunction13, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver0.getMax();
        double double8 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver0.solve(0, univariateFunction11, (double) (-1L), (double) 35, allowedSolution14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) (byte) 0, univariateFunction5, (double) 52, 1.0E-15d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 0.0d, (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, 97.0d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction7, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, (double) (byte) 1, (double) 52, (int) (short) 100);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (int) '#');
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction9, (double) (-1), (double) (-1.0f), (double) 1.0f, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction12, 5.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) (short) 0, 97.0d, 35);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        double double6 = bracketingNthOrderBrentSolver4.getMax();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (double) 0.0f, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, (double) 'a', (double) 100L, 10);
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, 1.0d, (double) 32, (int) (byte) 100);
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) 10L, (-1.0d), (int) (byte) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve(100, univariateFunction6, 1.0E-6d, 1.0E-15d, 97.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass11 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) (short) 100, (double) (short) 1, (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver4.getMax();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-6d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction8, (double) '#', 35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) (short) 100, 52.0d, (int) '#');
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 97.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(10.0d, (double) (short) 0, 10);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((int) (short) 0, univariateFunction12, (double) 52, (double) '#', 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) 52, (double) 0, 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) '4', univariateFunction6, (double) 1L, (double) 10L, (double) (short) 100, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1.0f, 100.0d, (double) 100.0f, (int) ' ');
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getMax();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction7, (double) (short) 10, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (double) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', 100);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass4 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) 0, 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (byte) 0, univariateFunction5, (double) (byte) 0, (double) 10L, 0.0d, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, 1.0E-6d, 0.0d, (int) (byte) 100);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve(52, univariateFunction8, (double) 5, (double) 32, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int8 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver3.solve((-1), univariateFunction12, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver4.getMax();
        double double10 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction5, (double) 10L, (double) 0, 32.0d, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, 1.0E-14d, (int) (byte) 10);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 0.0d, (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver3.getMin();
        double double7 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass9 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, 5.0d, (double) (short) 10, 32);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.solve(32, univariateFunction6, (double) (short) 10, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) 5, (double) (short) 100, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve(5, univariateFunction6, (double) 100, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (double) ' ', (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, (double) 97, (-1.0d), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve(35, univariateFunction12, (double) 32, (double) (byte) 10, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(100.0d, 52.0d, (double) (short) 10, 10);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        java.lang.Class<?> wildcardClass9 = bracketingNthOrderBrentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (double) 32, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve((int) '#', univariateFunction7, (double) (short) 100, 52.0d, (double) 1L, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver0.getMax();
        int int8 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver0.getMax();
        double double10 = bracketingNthOrderBrentSolver0.getStartValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(10.0d, 100.0d, (double) (byte) 100, 10);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve((-1), univariateFunction8, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) (byte) 100, (double) ' ', (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver4.solve((int) '4', univariateFunction9, (double) (-1.0f), 1.0E-15d, 0.0d, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction9, (double) (-1), (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, 1.0E-14d, (double) 100.0f, (int) 'a');
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) 5, (double) (short) 100, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        double double6 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver4.solve((int) '4', univariateFunction9, (double) (-1L), 10.0d, (double) 'a', allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction10, (double) (-1L), (double) 0.0f, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (double) (-1), 0.0d, (int) '4');
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) 'a', univariateFunction7, (double) 10, 10.0d, 5.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) '#');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), 5.0d, (int) (byte) 10);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getStartValue();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double12 = bracketingNthOrderBrentSolver2.getMin();
        int int13 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction15, 0.0d, 1.0E-14d, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (double) 1L, 97);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction8, (double) 32, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction9, (double) 97, 35.0d, 52.0d, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction8, 100.0d, (double) (byte) 0, 1.0E-15d, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (double) (byte) 0, 0.0d, (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver4.solve((int) '4', univariateFunction9, (double) (byte) -1, (double) 100.0f, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, (double) (-1L), 1.0E-14d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, 100.0d, (double) (byte) 0, 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.solve((-1), univariateFunction6, (double) 100, 97.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), (double) 10, (double) (short) 100, (int) ' ');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve((int) (byte) 10, univariateFunction6, (double) 0, (double) 10L, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, 0.0d, 100);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction10, (double) '4', (double) 1, (double) (byte) 100, allowedSolution14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) 10, (double) (byte) 1, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        double double7 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        int int8 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction9, (double) 'a', 1.0E-14d, 97.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (int) (short) 100);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) '#');
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve((int) ' ', univariateFunction7, 1.0E-15d, (double) 100, 35.0d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97.0d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, 52);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction4, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, (double) (byte) -1, 100);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), (double) (byte) -1, (double) 0, (int) '#');
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(35.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, (double) 35, (double) 97, 5);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getStartValue();
        double double13 = bracketingNthOrderBrentSolver2.getMax();
        double double14 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double15 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction17, 1.0E-6d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver0.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (double) 1.0f, (double) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int13 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (double) (-1), 0.0d, (int) '4');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve((int) (byte) 10, univariateFunction6, 1.0E-15d, (double) (short) 0, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getStartValue();
        double double13 = bracketingNthOrderBrentSolver2.getMax();
        double double14 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction16, (double) (-1.0f), 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getStartValue();
        double double7 = bracketingNthOrderBrentSolver3.getMax();
        java.lang.Class<?> wildcardClass8 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(52.0d, (double) 35, (int) ' ');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (short) 100, univariateFunction5, (double) 10, (double) 0, 52.0d, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 52, 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, (int) 'a');
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) (-1.0f), (double) ' ', 35);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, (double) (byte) 100, (double) (byte) 10, 5);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (double) 97, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, (int) '#');
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) (short) 0, 0.0d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (double) '4', (double) 'a', (int) (byte) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.solve((int) (short) 100, univariateFunction6, (double) (byte) -1, (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (double) (short) 1, (int) (short) 10);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve(10, univariateFunction6, (double) 35, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        double double4 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver0.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver0.solve(97, univariateFunction8, (double) (byte) 10, (double) 1L, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100L, (int) (byte) 100);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve(0, univariateFunction7, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) 'a', 5);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (double) (byte) -1, (double) 1L, (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getStartValue();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) '#', univariateFunction11, (double) 1, (double) 1.0f, allowedSolution14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (-1.0d), (double) 10.0f, 10);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 97.0d, (double) (short) 1, 97);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.solve(0, univariateFunction6, 32.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve(100, univariateFunction8, (double) (byte) 1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, 0.0d, (double) 10, (int) '#');
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 35, 35.0d, (double) (-1), (int) '#');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve((int) '4', univariateFunction6, (-1.0d), (double) (byte) 10, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction10, (double) (short) 100, (double) 100, 97.0d, allowedSolution14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int3 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver0.solve((int) (short) -1, univariateFunction5, (double) 0, (double) 10.0f, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int11 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, 0.0d, 35);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int9 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', 100);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 1.0d, 97);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        double double6 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver3.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver3.solve(0, univariateFunction9, (double) 97, 1.0E-15d, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction10, (double) 52, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, (double) 5, (double) 100, 5);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double3 = bracketingNthOrderBrentSolver0.getMin();
        double double4 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver3.getMax();
        double double9 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int10 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        java.lang.Class<?> wildcardClass7 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 0.0d, (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve((int) (short) 1, univariateFunction8, 10.0d, (double) (byte) 1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction4, 52.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) '4', univariateFunction12, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, (double) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        double double6 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int8 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver3.getStartValue();
        double double10 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver0.getMax();
        double double7 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int12 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double13 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (double) 5, 1.0E-6d, 100);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 0.0d, (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(52.0d, (double) (byte) 10, (double) 10L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (double) 1L, 97);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) 10L, (double) (byte) 10, (int) '4');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve(52, univariateFunction6, (double) (short) 1, (double) 1, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, (double) (byte) 100, (int) (short) 10);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) (byte) -1, univariateFunction6, (double) 100, (double) 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass8 = bracketingNthOrderBrentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) (short) 10, (int) 'a');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver3.solve(97, univariateFunction5, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction12, (double) (short) 0, 97.0d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (short) -1, univariateFunction10, (double) 10, (double) 5, 1.0E-15d, allowedSolution14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver0.getStartValue();
        double double7 = bracketingNthOrderBrentSolver0.getMin();
        double double8 = bracketingNthOrderBrentSolver0.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver0.solve(0, univariateFunction10, 10.0d, 0.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double12 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass13 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) (short) 100, (double) (short) 1, (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver4.solve((int) (short) 1, univariateFunction9, (double) 'a', (double) 52, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (double) (short) 0, (int) ' ');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve(35, univariateFunction5, 52.0d, (double) '4', (double) 97, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, (int) ' ');
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) '4', univariateFunction8, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 52, 10);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) (short) 10, univariateFunction7, 10.0d, (double) 10, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (double) 10.0f, (int) (byte) 100);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, (-1.0d), (int) '4');
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getMax();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        double double4 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver0.solve((int) '4', univariateFunction6, (double) 52, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) '4', (int) (byte) 100);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve(32, univariateFunction6, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (short) 0, univariateFunction13, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver0.getMax();
        int int6 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        java.lang.Class<?> wildcardClass8 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) '4', (double) (-1), 10);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        double double6 = bracketingNthOrderBrentSolver4.getStartValue();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double12 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction12, (double) (byte) 1, (double) 35, (double) '#', allowedSolution16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (double) (short) 0, (int) ' ');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) '4', univariateFunction5, 1.0E-14d, (double) (byte) 100, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(100.0d, (double) 1.0f, 97);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (double) 100, (double) (-1), 35);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve(0, univariateFunction6, (double) (short) -1, 1.0E-15d, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, 52);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction5, (double) (byte) 1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getStartValue();
        double double13 = bracketingNthOrderBrentSolver2.getMax();
        double double14 = bracketingNthOrderBrentSolver2.getMin();
        double double15 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction17 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction17, (double) (short) 100, (double) 100.0f, 10.0d, allowedSolution21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }
}

