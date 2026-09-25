package org.apache.commons.math.analysis.solvers;

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
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        double double4 = bracketingNthOrderBrentSolver0.getMin();
        double double5 = bracketingNthOrderBrentSolver0.getStartValue();
        int int6 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver0.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver0.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (double) ' ', (int) ' ');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) '#', univariateFunction6, 100.0d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction11, (-1.0d), (double) (byte) 10, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, 0.0d, (int) (byte) 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) (byte) 100, univariateFunction7, 5.0d, (-1.0d), 35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve((int) (short) 0, univariateFunction7, 5.0d, 0.0d, 100.0d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, 1.0E-6d, 0.0d, (int) (byte) 100);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver3.getStartValue();
        int int7 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, (double) 100L, (double) 10.0f, 97);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) 5, (int) (byte) 100);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (short) 1, univariateFunction7, 10.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction8, (double) (-1), 1.0E-15d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 1.0d, 97);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getStartValue();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve(100, univariateFunction9, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(35.0d, (double) (byte) 10, 52);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, 52);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (int) (short) 10);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) '#', univariateFunction7, (double) 0, (double) (short) 10, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        double double11 = bracketingNthOrderBrentSolver2.getMax();
        int int12 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double13 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) ' ', univariateFunction7, (double) 35, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getStartValue();
        double double11 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0.0f, 5);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve(35, univariateFunction4, (double) (-1), (double) (short) 100, allowedSolution7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        double double7 = bracketingNthOrderBrentSolver4.getMin();
        int int8 = bracketingNthOrderBrentSolver4.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, 97);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction5, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) ' ', univariateFunction7, (double) 5, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, 97);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction13, 1.0d);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction6, (double) (short) -1, 0.0d, 1.0E-15d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', 1.0d, 32);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double2 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver0.getMin();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction8, (double) (short) 1, (double) (byte) 1, 0.0d, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 35, 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve(97, univariateFunction4, (double) (-1.0f), (double) 97, 35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) 100, (int) '4');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve(10, univariateFunction5, 32.0d, 35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve(35, univariateFunction13, (double) (short) -1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver3.getMin();
        double double7 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver3.solve((int) '4', univariateFunction9, (double) (byte) -1, (double) 97, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (int) (short) 10);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction5, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double11 = bracketingNthOrderBrentSolver2.getMax();
        int int12 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve((int) (byte) 100, univariateFunction8, 97.0d, 5.0d, (double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(52.0d, 52.0d, 5);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
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
        double double14 = bracketingNthOrderBrentSolver2.getMax();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) 1L, 100);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve((int) (byte) 100, univariateFunction8, (double) 35, (double) 100.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, 1.0E-14d, 1.0d, (int) 'a');
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0.0f, 1.0E-14d, (int) (byte) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve(5, univariateFunction5, (double) (-1.0f), (double) 100.0f, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) '4', 0.0d, (int) ' ');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getStartValue();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) (byte) 0, univariateFunction9, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, 52);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction5, (double) '4', 52.0d, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver3.solve(97, univariateFunction8, (double) (-1), (double) 32, (double) 100L, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver4.getEvaluations();
        java.lang.Class<?> wildcardClass9 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), 32.0d, (int) '#');
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) '4', univariateFunction6, (double) 0L, (double) (short) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
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
            double double12 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction10, (double) ' ');
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
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getStartValue();
        double double11 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction13, (double) (short) 1, (double) (short) 100, allowedSolution16);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), 97);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (short) -1, univariateFunction9, (double) 10, (double) (short) 0, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, 1.0d, (double) '4', 5);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, 97);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 1.0d, 35);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) (byte) 1, univariateFunction5, (double) 0, (double) 100L, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 0.0d, 0.0d, (int) (byte) 10);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) 100, (double) 'a', 10);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        double double7 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver4.solve(0, univariateFunction9, (double) 52, (double) 0L, (double) (-1L), allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(52.0d, (double) 100.0f, 5);
        java.lang.Class<?> wildcardClass4 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 10);
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) ' ');
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction5, 35.0d, (double) 1, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 10);
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction6, (double) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (double) 1L, 97);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(35, univariateFunction9, (double) 5, (double) 1.0f, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(100.0d, (double) 'a', (double) (-1L), 10);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction8, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, (int) (short) 100);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, 97);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), (double) 100.0f, 5);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0.0f, 1.0E-15d, (double) 100L, 97);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (double) 100, (double) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        java.lang.Class<?> wildcardClass10 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) 97, (int) '#');
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) (short) 0, univariateFunction7, (double) (byte) 10, 100.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) (byte) 100, (double) (byte) 10, (int) '4');
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        int int8 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 0, 5);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve((int) '4', univariateFunction4, (double) 0L, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) (-1.0f), (double) ' ', 35);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction10, (double) 5, 10.0d, allowedSolution13);
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
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 1.0d, (double) 1.0f, (int) ' ');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve((int) (byte) 10, univariateFunction6, (-1.0d), (-1.0d), (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) (short) 100, (double) (short) 1, (int) (byte) 10);
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (double) 1L, (int) (short) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) (short) 10, univariateFunction5, 10.0d, (double) (short) 0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction10, (double) 100.0f, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (double) (short) 10, (double) 97, (int) '#');
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double10 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        int int11 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int12 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double13 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int14 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
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
        int int12 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction14, (-1.0d), (double) 10L, allowedSolution17);
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
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (int) '#');
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction7, (double) 100.0f, 5.0d, (double) 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', (int) (short) 100);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
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
        double double12 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) '4');
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, 0.0d, 100);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        double double5 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, 1.0E-14d, 1.0d, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getStartValue();
        double double6 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, (int) '#');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve(35, univariateFunction4, 52.0d, 10.0d, allowedSolution7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve((int) (byte) 100, univariateFunction7, (double) (-1L), 35.0d, 100.0d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) 'a', (int) (short) 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', 52);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction4, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (double) 100L, (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        java.lang.Class<?> wildcardClass7 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction11, 0.0d, (double) (short) 0, (double) 35);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction7, 1.0E-15d, (double) 32, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, 97);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double3 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver0.getMin();
        int int5 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver0.solve(97, univariateFunction8, (double) 0, (double) (byte) 1, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 52, 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver3.getMax();
        java.lang.Class<?> wildcardClass7 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(35.0d, 97);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        int int6 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver3.getMin();
        double double8 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) 0, 35);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100, (double) 0.0f, (double) 0.0f, (int) (byte) 10);
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getStartValue();
        double double7 = bracketingNthOrderBrentSolver4.getStartValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (double) (short) 100, (double) (short) 1, 52);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        int int7 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve(0, univariateFunction9, (double) 100, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, 1.0d, (int) (short) 100);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, (double) (byte) -1, (double) 0.0f, (int) ' ');
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) 100.0f, (double) 10, 100);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) ' ', univariateFunction7, (double) (short) 0, 0.0d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) '4', 0.0d, (int) ' ');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, 1.0E-6d, 0.0d, (int) (byte) 100);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getStartValue();
        int int7 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver3.getMax();
        double double9 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver3.solve((int) (byte) 10, univariateFunction11, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int7 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver0.solve(100, univariateFunction10, 10.0d, 10.0d, allowedSolution13);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, (double) 10L, 1.0E-14d, (int) (short) 100);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (int) (short) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction4, (double) 10L, (double) 97, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), 5);
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) '4', univariateFunction11, 10.0d, (double) 10.0f);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) (byte) 100, 52);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) ' ', univariateFunction10, (double) (byte) 10, (double) (-1), allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
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
        int int13 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double14 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction16, (double) (byte) 1, (double) '4', allowedSolution19);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) (byte) 10, (int) ' ');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1L, 52.0d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) (-1), (int) '4');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver4.solve(52, univariateFunction11, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        java.lang.Class<?> wildcardClass9 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getMax();
        double double4 = bracketingNthOrderBrentSolver0.getStartValue();
        double double5 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver0.getStartValue();
        double double8 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver0.getStartValue();
        double double10 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, 10.0d, (double) (short) 0, (int) '4');
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve(1, univariateFunction7, 1.0E-14d, (double) 1L, 0.0d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
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
        java.lang.Class<?> wildcardClass12 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
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
        double double13 = bracketingNthOrderBrentSolver2.getStartValue();
        double double14 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction16, (double) 1, (double) 1L);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) '#');
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(1, univariateFunction7, 1.0E-14d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getMax();
        double double12 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (double) (byte) 0, 0.0d, (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 5);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) (short) 0, univariateFunction5, (double) (short) 1, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        double double11 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction14, 0.0d, (double) (short) -1, 32.0d, allowedSolution18);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, 1.0E-14d, 1.0d, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(0, univariateFunction7, (double) (short) 1, 0.0d, 32.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getMax();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) 100, (double) 'a', 10);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) (byte) 1, univariateFunction8, 0.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (double) 1L, 97);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        double double6 = bracketingNthOrderBrentSolver3.getMax();
        double double7 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) 0, 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver3.getMin();
        double double7 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) '4', univariateFunction5, (double) 0, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
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
        double double13 = bracketingNthOrderBrentSolver2.getStartValue();
        double double14 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double15 = bracketingNthOrderBrentSolver2.getStartValue();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-15d + "'", double14 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0.0f, (-1.0d), (double) 'a', (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getMax();
        int int7 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, 0.0d, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, (double) (-1L), (int) ' ');
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (double) 0, 97);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
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
        double double16 = bracketingNthOrderBrentSolver2.getMax();
        double double17 = bracketingNthOrderBrentSolver2.getStartValue();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
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
        int int10 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100, (double) 0.0f, (double) 0.0f, (int) (byte) 10);
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver4.solve((int) ' ', univariateFunction8, (double) 1, (double) 97, (double) (short) -1, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction11, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
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
        double double13 = bracketingNthOrderBrentSolver2.getStartValue();
        double double14 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double15 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double16 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-15d + "'", double14 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, (double) (-1.0f), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
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
        double double12 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int13 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) (byte) 100, (double) ' ', (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double12 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve((int) '#', univariateFunction14, 1.0E-14d, (double) (short) -1, allowedSolution17);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        java.lang.Class<?> wildcardClass10 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(97, univariateFunction6, (double) 5, 1.0E-14d, (double) (byte) 1, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
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
        double double13 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve(97, univariateFunction15, 52.0d, (double) 'a');
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', 0.0d, 52);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction8, (double) (short) 0, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1.0f), (double) 0, (double) (byte) -1, (int) (short) 100);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (short) 10, (double) 1.0f, (int) (short) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) '4', univariateFunction6, (double) 52, (double) (short) -1, 10.0d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', (double) 0.0f, (double) (short) 100, (int) (short) 100);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (double) 5, (double) 1L, 100);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        java.lang.Class<?> wildcardClass7 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) 100, (double) 'a', 10);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, (double) 10.0f, 52);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0.0f, (-1.0d), (double) 'a', (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getMax();
        double double7 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 0.0d, 97.0d, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, 1.0E-14d, 100);
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', 100);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) 100, (double) 'a', 10);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getMax();
        double double8 = bracketingNthOrderBrentSolver4.getStartValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int12 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double2 = bracketingNthOrderBrentSolver0.getMax();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getMax();
        double double5 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 0.0d, (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 35, 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction4, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 52, 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver3.getMax();
        double double7 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver3.getMin();
        double double9 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), 52.0d, (double) (byte) 10, 52);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (int) 'a');
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, 1.0E-14d, (int) (byte) 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) (byte) 0, univariateFunction6, (double) 100, 0.0d, 35.0d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) 1L, (double) ' ', 35);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        double double2 = bracketingNthOrderBrentSolver0.getMin();
        int int3 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double4 = bracketingNthOrderBrentSolver0.getMax();
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (int) (byte) 10);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (double) 97, 0.0d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 32.0d, (int) (byte) 10);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(52.0d, (int) (short) 100);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        double double11 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getMin();
        double double13 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double14 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double15 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) (short) 0, (double) 1.0f, (int) (short) 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, 100);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) '4', (double) (-1), 10);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        double double6 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (double) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        int int6 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver3.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) '4', univariateFunction9, (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) '4', univariateFunction5, 5.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) (-1L), (double) '#', (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100.0f, (double) (byte) -1, (double) 32, (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        java.lang.Class<?> wildcardClass9 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((int) (short) -1, univariateFunction12, 100.0d, (double) (-1L), 0.0d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), 52.0d, (double) (byte) 10, 52);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        int int6 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        java.lang.Class<?> wildcardClass8 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', 0.0d, 52);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), 35.0d, (double) 35, 97);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 1.0f, 100.0d, (int) '#');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100.0f, (double) 10L, (int) (short) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve(0, univariateFunction5, (double) (byte) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (double) 35, (double) (-1L), (int) (short) 10);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, 32.0d, (int) (short) 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) (short) -1, univariateFunction7, (double) 1L, (-1.0d), allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0.0f, 5);
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver3.solve(32, univariateFunction9, (double) 10L, (double) 10L, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 0.0d, (double) 10.0f, 100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int13 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve((int) ' ', univariateFunction15, 97.0d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction12, (double) (short) -1, (double) 100, (double) 32, allowedSolution16);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), (double) 10, (double) (short) 100, (int) ' ');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) (short) -1, univariateFunction7, (double) ' ', (double) (short) 1, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, (double) 10.0f, 52);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 35, (double) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
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
        double double13 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction6, (double) (byte) 1, (double) ' ', 52.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction13, 100.0d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int3 = bracketingNthOrderBrentSolver0.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver0.solve((int) (short) 100, univariateFunction5, (double) (byte) 0, (double) (-1.0f), allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, (double) 97, (double) (byte) 1, 5);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(35, univariateFunction9, 35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) (byte) 100, (double) ' ', (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(100, univariateFunction9, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', 0.0d, 52);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver0.getStartValue();
        double double7 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver0.getMin();
        int int9 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, (double) 10, (double) (short) -1, (int) (short) 10);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        java.lang.Class<?> wildcardClass7 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, 97);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(97, univariateFunction6, 0.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
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
        double double12 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double13 = bracketingNthOrderBrentSolver2.getMax();
        double double14 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction16, 0.0d, (double) '#', (double) (-1.0f), allowedSolution20);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, (int) (short) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        int int6 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, 1.0E-14d, 100);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver0.solve(35, univariateFunction7, 35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction9, (double) (short) -1, 10.0d, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', 100);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int5 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver0.getStartValue();
        double double8 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) (byte) 100);
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver3.getStartValue();
        double double9 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction11, 1.0E-15d, 0.0d, (double) (short) 10, allowedSolution15);
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
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) 32, 35);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 32);
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (short) 0, 52);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver3.solve(5, univariateFunction9, (double) 100, (double) '#', (double) 32, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, 32.0d, 97);
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) (byte) 0, univariateFunction6, 0.0d, 0.0d, (double) 1.0f, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(10.0d, 100.0d, (double) (byte) 100, 10);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(0, univariateFunction7, (double) 5, 1.0E-14d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (double) (byte) 1, (double) (-1L), (int) (byte) 10);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, (double) 10L, 52);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) (short) 1, univariateFunction5, (double) 1.0f, (double) 5, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction6, 52.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass9 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double12 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 97.0d, (double) 10L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (double) (byte) 0, 0.0d, (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        int int7 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver4.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver4.solve(1, univariateFunction10, (double) 0.0f, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0.0f, (-1.0d), (double) 'a', (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) (byte) 0, univariateFunction7, (double) 10, (double) (short) -1, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) '4', (double) 32, 97);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction12, (double) 100L, (double) '4');
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, 100.0d, 10);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double12 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver4.getMin();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction14, (double) 52, (double) (short) 10, allowedSolution17);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) 1.0f, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getMin();
        double double7 = bracketingNthOrderBrentSolver3.getMin();
        int int8 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver3.solve((int) ' ', univariateFunction10, 0.0d, (double) 10, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (double) 10.0f, (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (short) -1, univariateFunction6, (double) 10, 0.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) (-1.0f), (double) ' ', 35);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) 'a', univariateFunction6, (double) (byte) -1, (double) (byte) 0, (double) 1.0f, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 35, 1.0E-6d, 97.0d, 97);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.solve((int) (byte) 10, univariateFunction6, (-1.0d), (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) '4', 0.0d, (int) ' ');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver4.solve((int) (byte) 0, univariateFunction8, (double) ' ', (double) 100L, (double) 0.0f, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100, (double) (-1.0f), (double) 1.0f, (int) ' ');
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getMax();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(100.0d, 100.0d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', 97);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve(35, univariateFunction4, 0.0d, (double) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction10, (double) '#', 97.0d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) 1L, 100);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (int) (byte) 10);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        java.lang.Class<?> wildcardClass4 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double3 = bracketingNthOrderBrentSolver0.getMin();
        int int4 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), 52.0d, (double) (byte) 10, 52);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver4.solve((int) ' ', univariateFunction11, 1.0d, 52.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1L, 0.0d, (double) ' ', (int) (short) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(52, univariateFunction6, 35.0d, 0.0d, (double) 0L, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0.0f, (double) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int12 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction12, (double) 32, (double) ' ', allowedSolution15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction10, 0.0d, (double) (-1L));
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
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, 1.0d, (int) (short) 100);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, 1.0E-14d, (double) 100.0f, 97);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, 100.0d, (double) (byte) 0, 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getStartValue();
        double double5 = bracketingNthOrderBrentSolver0.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver0.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, 97.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, (int) (byte) 100);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction5, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, 0.0d, (int) (short) 10);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1.0f, 1.0d, (double) 5, (int) '4');
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getStartValue();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double12 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
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
        double double14 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 52, 10);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) '#', univariateFunction6, (double) (short) 100, 0.0d, 1.0E-15d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
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
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction10, 1.0d, 1.0E-14d);
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
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction12, (double) '4', (double) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), 32.0d, (double) 10L, (int) (byte) 100);
        double double5 = bracketingNthOrderBrentSolver4.getStartValue();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double12 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve(1, univariateFunction14, (double) 0L, (double) '#');
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), 1.0E-14d, (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        int int11 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int12 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double13 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double14 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double15 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, 97.0d, (int) (byte) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve(35, univariateFunction5, (double) 10, (-1.0d), (-1.0d), allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (int) (short) 10);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (double) 100, (double) (byte) -1, (int) (short) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver4.solve((int) (short) -1, univariateFunction6, (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (int) (byte) 10);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(52.0d, (double) 97, (double) (short) 100, 52);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.solve((int) (byte) 100, univariateFunction7, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) 1.0f, (int) ' ');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (byte) 1, univariateFunction6, (double) 0L, (double) 10.0f, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getMax();
        int int12 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int13 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction15, (double) ' ', 32.0d, allowedSolution18);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (int) (short) 10);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        int int8 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(35.0d, 35.0d, (double) (short) 1, 52);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) 100, (int) (byte) 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', 35.0d, 1.0E-6d, (int) (short) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(100, univariateFunction6, (double) (-1.0f), (double) (byte) 0, (double) 10.0f, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, (double) '4', 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1.0f, (double) (short) 10, (int) (short) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (short) 10, univariateFunction5, 0.0d, (-1.0d), 0.0d, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, 1.0E-6d, (int) ' ');
        java.lang.Class<?> wildcardClass4 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction8, (double) (short) -1, (double) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, 5);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 1.0E-6d, (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) '4', univariateFunction8, (double) (byte) -1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        int int12 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, 0.0d, (int) (short) 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction9, (double) (-1), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) '#');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((-1), univariateFunction6, 35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction6, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction14, (double) (-1), (double) 32, (double) ' ', allowedSolution18);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
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
        double double16 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.doSolve();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-15d + "'", double16 == 1.0E-15d);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver4.getMax();
        double double10 = bracketingNthOrderBrentSolver4.getMax();
        int int11 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double12 = bracketingNthOrderBrentSolver4.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver4.solve((int) '4', univariateFunction14, (double) (-1), (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, (double) 97, (int) (short) 100);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, (double) 100L, (double) (byte) 10, 100);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), 10);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction8, 0.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) 1.0f, (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (double) (byte) 100, (double) (-1), (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver4.getStartValue();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
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
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver3.getMin();
        double double7 = bracketingNthOrderBrentSolver3.getMax();
        double double8 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getMin();
        double double12 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (double) 100L, (int) (byte) 100);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 52);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100.0f, (double) 32, 0.0d, 5);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve(5, univariateFunction6, 97.0d, (double) (byte) 0, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (double) ' ', (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int8 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, (double) (-1), 10);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 1.0d, 97);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        double double6 = bracketingNthOrderBrentSolver3.getMin();
        double double7 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, 97.0d, (double) 10L, (int) '#');
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) 'a', univariateFunction7, (double) (-1.0f), (double) 0.0f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
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
        int int16 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double17 = bracketingNthOrderBrentSolver2.getMin();
        int int18 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction20, (double) 0L, 1.0E-15d);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, (double) (-1L), (double) (short) 1, 32);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        double double11 = bracketingNthOrderBrentSolver2.getMin();
        double double12 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, (double) (byte) 100, (int) (short) 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) 97, 1.0E-6d, (int) ' ');
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction10, (double) (byte) 0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        double double12 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int13 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        java.lang.Class<?> wildcardClass11 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(10.0d, (double) (byte) 1, 1.0E-15d, 100);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double11 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) '4', univariateFunction6, (double) ' ', 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1.0f, (double) 10L, (double) 35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (double) 100, (double) (-1), 35);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(32, univariateFunction6, 1.0d, (double) 100, (double) 'a', allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction11, (double) (short) -1, (double) ' ', allowedSolution14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, 52.0d, (double) 97, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) 100, (double) 'a', 10);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getMin();
        int int8 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (double) 0.0f, 100);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver3.getStartValue();
        double double8 = bracketingNthOrderBrentSolver3.getMax();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (-1.0d), 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) (byte) 100, univariateFunction7, 5.0d, (double) (short) 100, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) '#');
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (double) 100.0f, (int) (byte) 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve((int) '4', univariateFunction7, (double) 100, (double) 100.0f, (double) (-1), allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, 100.0d, (int) (byte) 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver3.getMax();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double12 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, 97.0d, (double) 10L, (int) '#');
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getMax();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) (short) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction4, (double) 100L, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (double) (byte) 100, (double) (-1), (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        double double6 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getMin();
        double double8 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction7, 0.0d, 1.0d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, 32.0d, (int) (short) 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        double double6 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int8 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) (short) 100, (double) (short) 1, (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(100, univariateFunction7, (double) 1L, (double) 1.0f, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int11 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 52, 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver3.getMax();
        double double7 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver3.getMin();
        int int9 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver3.solve(100, univariateFunction11, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (double) ' ', (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
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
        double double12 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int13 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (int) (short) 10);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction5, 52.0d, (double) 'a', 35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 0, (double) 100, (int) (byte) 100);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction13, (double) 'a', (double) 5, (double) 0L, allowedSolution17);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, 35.0d, (double) 100.0f, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) 100, (double) 'a', 10);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver4.getMax();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0.0f, (-1.0d), (double) 'a', (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 10, (double) 32, (int) (byte) 100);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), 100.0d, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double4 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 0, (double) 0.0f, (int) (short) 10);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
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
        double double13 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double14 = bracketingNthOrderBrentSolver2.getStartValue();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, (double) 5, 10.0d, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (short) 10, univariateFunction7, (double) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) (byte) 100, 5);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) 'a', univariateFunction7, (double) 0L, 1.0E-6d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 0, (double) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(10.0d, (double) 0.0f, (double) 1.0f, (int) '#');
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) '4', (int) (byte) 100);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (double) (byte) 0, 0.0d, (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(0, univariateFunction7, 35.0d, (double) '4', (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', 100);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', 35.0d, 1.0E-6d, (int) (short) 100);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) 5, (double) (short) 100, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver4.getStartValue();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
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
        int int16 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bracketingNthOrderBrentSolver2.solve((int) '#', univariateFunction18, (double) 1.0f, (double) 5, (double) 0L);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
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
        double double13 = bracketingNthOrderBrentSolver2.getStartValue();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (double) (short) 100, (double) (short) 1, 52);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(1, univariateFunction8, (double) (byte) -1, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
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
            double double16 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction12, 32.0d, (double) 'a', (double) (-1.0f));
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
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 32.0d, (int) (byte) 10);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, (int) '4');
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 52.0d, (double) 5, 32);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver0.getStartValue();
        double double7 = bracketingNthOrderBrentSolver0.getMin();
        int int8 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver0.getStartValue();
        double double10 = bracketingNthOrderBrentSolver0.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver0.solve((int) '#', univariateFunction12, (double) ' ', (double) ' ', allowedSolution15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (double) 100, (double) (byte) -1, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) (byte) 10, univariateFunction7, (double) (byte) 10, 0.0d, (double) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 35, (double) (byte) 100, (int) (byte) 10);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 35, (int) (short) 100);
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) 100, (int) (byte) 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, 97);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
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
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction13, 0.0d, (double) 32, (double) 0.0f, allowedSolution17);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, 97.0d, 5);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction10, (double) 1L, (-1.0d), (double) 52, allowedSolution14);
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
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), 52.0d, (double) (byte) 10, 52);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver4.solve(1, univariateFunction11, 0.0d, (double) 1L, 35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, (double) 97, 10);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
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
        double double12 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (double) ' ', (double) (-1L), (int) (byte) 100);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) 0, 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve(0, univariateFunction7, 0.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', 52);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }
}

