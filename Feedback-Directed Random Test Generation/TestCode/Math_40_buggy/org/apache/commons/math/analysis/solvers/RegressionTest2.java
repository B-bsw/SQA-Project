package org.apache.commons.math.analysis.solvers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0.0f, 52.0d, (double) 0L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((int) '#', univariateFunction11, 0.0d, (double) (-1), 10.0d, allowedSolution15);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) 1.0f, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int8 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve((int) (byte) 1, univariateFunction10, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction10, (double) (short) 10, 1.0d, (double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getMin();
        double double4 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver0.solve((int) 'a', univariateFunction6, (double) 97, (double) 1L, allowedSolution9);
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
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.doSolve();
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
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(35.0d, (int) (short) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction4, (double) (short) -1, (double) 100L, allowedSolution7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) 'a', 5);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (byte) -1, univariateFunction6, (double) 97, (double) (-1L), 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction10, 0.0d, (double) (short) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        double double12 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction14, (double) 10L, 35.0d);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 1.0E-15d, 52);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve(100, univariateFunction6, 10.0d, (double) 100L, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, 5);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, 5);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getMax();
        int int4 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver0.solve(32, univariateFunction6, (double) (short) 100, 100.0d, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100L, (int) (byte) 100);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) ' ', univariateFunction6, (double) (short) 1, (double) (short) 100, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        double double6 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) (short) 10, univariateFunction8, 0.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) 0.0f, 100.0d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction9, 97.0d, (double) (byte) 1, (double) 1, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 52);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction6, (double) 10, (double) (byte) 10, (double) 100.0f, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100L, (int) (byte) 100);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) '4', univariateFunction6, (double) 0L, 97.0d, (double) (short) -1, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction7, (double) (short) -1, (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(10.0d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) (short) 100, (double) (short) 1, (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction9, (double) 0.0f, (double) '4', (double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) ' ');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (short) -1, univariateFunction11, (double) (short) 0);
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
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int3 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int4 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver0.solve((int) (short) -1, univariateFunction6, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction9, (double) 10, (double) 10.0f, (double) (-1.0f), allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((-1), univariateFunction8, (double) (short) 0, (double) (byte) 1, (double) 'a', allowedSolution12);
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (int) (short) 10);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction5, (double) 0.0f, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(35.0d, (double) 100, (double) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass8 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction10, 97.0d, 100.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 52, (double) (short) 100, (int) ' ');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(5, univariateFunction6, (double) (-1.0f), (double) (short) 100, (double) 32, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        java.lang.Class<?> wildcardClass9 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (-1.0d), (int) 'a');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) '#', univariateFunction5, (double) (-1L), (double) (-1), 1.0E-15d, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int8 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve(100, univariateFunction10, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, (-1.0d), (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction7, 1.0E-15d, 1.0E-14d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver0.solve((int) 'a', univariateFunction4, 0.0d, 32.0d, allowedSolution7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver3.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve((int) (short) 100, univariateFunction8, (double) 0.0f, 52.0d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction5, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve((-1), univariateFunction8, 10.0d, 52.0d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction11, 5.0d, 5.0d, allowedSolution14);
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
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) 100, (double) 'a', 10);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver4.solve((int) (short) 100, univariateFunction8, (double) 100L, (double) '#', 0.0d, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) 52, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) '4', 0.0d, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) (byte) 1, (int) '4');
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction11, 1.0E-14d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction10, (double) (short) 1, 0.0d, (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (int) (byte) 100);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((-1), univariateFunction5, (double) 100.0f, 5.0d, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, (double) 10.0f, (double) 10L, 5);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve(100, univariateFunction6, 0.0d, (double) (byte) -1, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction7, 1.0d, (double) (byte) 0, (double) 100.0f, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) (short) 100, (double) (short) 1, (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve((int) (byte) 10, univariateFunction9, 1.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) (short) 0, univariateFunction6, (double) (-1.0f), (double) 10, (double) '#', allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve(97, univariateFunction6, (double) (short) 0, (double) (byte) -1, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        int int6 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction8, (double) '#', 10.0d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, (double) (byte) 10, (double) (-1.0f), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) '4', 5.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) ' ', univariateFunction5, (double) (-1), (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction10, (double) (byte) 10, (double) (byte) 1);
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
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        int int4 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver0.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getStartValue();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        int int12 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction14, 0.0d, (double) 10.0f);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction11, (double) 'a', (double) (short) -1, (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        java.lang.Class<?> wildcardClass10 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getMax();
        int int4 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver0.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, 1.0E-6d, (double) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction6, (double) (short) 1, (double) '#', allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 52, (double) (short) 100, (int) ' ');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) (byte) 10, univariateFunction6, (double) (byte) 10, 10.0d, (double) (byte) -1, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (short) -1, univariateFunction9, (double) ' ', 1.0E-6d, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction11, 100.0d, 1.0E-14d, (double) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) 5, (double) (short) 100, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve(5, univariateFunction7, (double) '#', (double) 1L, (double) 0, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction6, 97.0d, (double) 0.0f, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) 5, (double) (short) 100, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) (byte) 10, univariateFunction7, (double) (short) -1, (double) (byte) 1, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (int) (byte) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction4, (double) (byte) 1, 35.0d, allowedSolution7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction8, (double) 100.0f, (double) 0L, 1.0E-14d, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (double) 100L, (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) (short) -1, univariateFunction7, (double) 10, (double) (byte) 100, 97.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction6, (double) 32, (double) 32, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (double) ' ', (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        double double6 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve(32, univariateFunction8, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction7, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', 97);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction4, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction11, 0.0d, 0.0d, 1.0E-15d);
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
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, (double) 97, (int) (short) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve(0, univariateFunction5, (double) (-1.0f), (double) 10, (double) (-1.0f), allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) (byte) 100, (double) ' ', (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve((int) (short) 0, univariateFunction8, 10.0d, (double) (short) 10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver0.solve(52, univariateFunction6, (double) (byte) 10, (-1.0d), (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction10, (double) (byte) 0, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (double) (-1), 1.0d, 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.solve((int) (byte) 1, univariateFunction6, (-1.0d), (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) (short) 100, (double) (short) 1, (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve(52, univariateFunction8, (double) (short) 100, 5.0d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (double) 5, (double) 1L, 100);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve(52, univariateFunction7, 100.0d, (double) 1L, (double) (byte) 0, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (-1.0d), (double) (-1), (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        int int6 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1.0f), 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction5, 1.0E-6d, (double) '4', (double) 100L, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction8, 1.0E-15d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((-1), univariateFunction12, (double) 0L, 100.0d, allowedSolution15);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction11, (double) (byte) 100, (double) (short) 100, allowedSolution14);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, 1.0E-6d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100L, (int) (byte) 100);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        java.lang.Class<?> wildcardClass11 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction11, (double) 100, (double) '4', 1.0E-15d, allowedSolution15);
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
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, 100.0d, (double) (byte) 0, 10);
        double double5 = bracketingNthOrderBrentSolver4.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(32, univariateFunction7, 10.0d, 1.0E-14d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (int) (byte) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve((int) (short) -1, univariateFunction4, 35.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) (byte) 1, (double) (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) 100.0f, 0.0d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) 100, (int) (byte) 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) 'a', univariateFunction6, (double) (byte) 1, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction9, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(1, univariateFunction9, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', 52);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) ' ', univariateFunction6, (double) (-1), 1.0E-6d, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, 97);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction4, (double) (-1L), (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', 35.0d, 1.0E-6d, (int) (short) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) (byte) 0, univariateFunction6, (double) (-1.0f), (double) 100, (double) 100.0f, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((int) (short) 0, univariateFunction12, (double) (-1.0f), 1.0E-15d, allowedSolution15);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (-1L), 100);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (byte) 100, univariateFunction6, (double) 0L, (double) (short) 100, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver4.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve(32, univariateFunction10, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) (byte) 100, (double) ' ', (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((-1), univariateFunction7, (double) '4', (double) 52, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver3.solve((int) ' ', univariateFunction10, (double) (-1.0f), (double) 10L, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) 0.0f, 100.0d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = bracketingNthOrderBrentSolver0.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (double) ' ', (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        double double6 = bracketingNthOrderBrentSolver3.getMax();
        double double7 = bracketingNthOrderBrentSolver3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int8 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int9 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction8, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction11, 1.0E-15d, (double) (short) 1, 1.0E-6d, allowedSolution15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction6, 97.0d, (double) (short) 0, (-1.0d), allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getStartValue();
        int int5 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction11, (double) 100, (double) 1L, allowedSolution14);
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
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass2 = bracketingNthOrderBrentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, (double) 10, (double) (short) -1, (int) (short) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve((int) 'a', univariateFunction6, (double) (-1.0f), 1.0E-14d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) (short) 0, univariateFunction6, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) (byte) 10, univariateFunction7, (double) (short) 100, (double) (short) 0, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (double) (byte) 0, 0.0d, (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
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
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(52.0d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction8, (double) (short) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (int) (byte) 100);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction7, (double) 5, (double) (byte) 100, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(35.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, 1.0E-6d, (int) '#');
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.doSolve();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, 0.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction5, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) (byte) 100, (double) ' ', (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve((int) (byte) 1, univariateFunction8, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver0.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver0.solve(100, univariateFunction6, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.doSolve();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double3 = bracketingNthOrderBrentSolver0.getMin();
        double double4 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver0.solve(52, univariateFunction6, (double) (short) 0, 1.0E-15d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction6, (double) (byte) 100, (double) 0, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve((int) (short) 0, univariateFunction8, (double) (byte) 100, (double) 100.0f, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int3 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver0.solve((int) (short) -1, univariateFunction5, 35.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 5);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve(97, univariateFunction4, (double) (short) 0, 32.0d, allowedSolution7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        java.lang.Class<?> wildcardClass8 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 0.0d, (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (byte) 0, univariateFunction7, (double) (short) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (byte) 1, univariateFunction7, (double) ' ', 35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(97, univariateFunction12, 97.0d);
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
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (double) 5, (double) 1L, 100);
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve((int) (short) 10, univariateFunction7, (double) (-1), (double) 1.0f, 97.0d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1.0f, 100.0d, (double) (byte) 100, 52);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(100, univariateFunction7, 1.0d, 52.0d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, 1.0E-14d, (int) (byte) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) ' ', univariateFunction5, (double) ' ', (double) '4', allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        int int10 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        double double12 = bracketingNthOrderBrentSolver2.getMax();
        int int13 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction15, (double) (short) 10, 5.0d, 0.0d, allowedSolution19);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, (double) 10.0f, (double) 10L, 5);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve((int) (short) -1, univariateFunction6, 1.0E-15d, (double) (byte) 0, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) (byte) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction4, 10.0d, 97.0d, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (double) (byte) -1, (double) 52, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) 1L, 100);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve((int) (short) 100, univariateFunction8, (double) (byte) 0, 1.0E-14d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1.0f, 100.0d, (double) (byte) 100, 52);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve(0, univariateFunction7, (double) (-1L), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction10, 1.0d, (double) 0, 1.0E-14d);
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
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1L, (double) (-1.0f), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction12, (double) 1.0f, (double) (-1.0f), (double) 100, allowedSolution16);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction13, (-1.0d), 52.0d, 100.0d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, (double) 97, (int) (short) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) (byte) 1, univariateFunction5, 52.0d, (double) 1.0f, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        double double2 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver0.solve(0, univariateFunction4, (double) (-1L), (double) 10L, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve((int) '4', univariateFunction4, (double) (byte) 0, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve(1, univariateFunction9, 10.0d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (short) 0, univariateFunction9, (double) 0L, 52.0d, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass11 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction8, (double) '4', 35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction13, 0.0d);
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
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double2 = bracketingNthOrderBrentSolver0.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver0.solve((int) (byte) 0, univariateFunction4, (-1.0d), (double) 0, 32.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.doSolve();
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, 1.0E-6d, (int) (short) 10);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (short) -1, univariateFunction5, (double) 10, (double) (-1L), (double) '4', allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(1, univariateFunction11, (double) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve(0, univariateFunction8, (double) 52, (double) 10L, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) '4', (double) 10.0f, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (double) (short) 0, (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve(0, univariateFunction6, 1.0d, (double) 10.0f, (double) (short) 100, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction9, (double) 1L, (double) 0L, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) '#', univariateFunction8, (double) 0L, (double) 32, (double) '4', allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', 97.0d, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getStartValue();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        int int12 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int13 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction15, (double) 'a', (double) 100L, allowedSolution18);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 0.0d, (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver3.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver3.solve((int) (short) 10, univariateFunction8, (double) (byte) 1, 32.0d, (double) 1L, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((-1), univariateFunction9, 35.0d, (double) (byte) -1, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction12, (double) 52);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) 100, (double) 'a', 10);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getStartValue();
        java.lang.Class<?> wildcardClass7 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 10.0d, (double) 5, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction7, (double) '#', (double) (short) 100, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double2 = bracketingNthOrderBrentSolver0.getMax();
        int int3 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver0.solve((int) (short) 100, univariateFunction5, 35.0d, (double) '4', (double) (short) 0, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        int int12 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction14, 100.0d, 0.0d, allowedSolution17);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(10.0d, 0.0d, (double) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) 100L, (double) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction12, (double) 52, (double) 5, (double) 32, allowedSolution16);
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
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction12, 1.0d);
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
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction5, (double) 100.0f, (double) 0L, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction12, (double) (byte) 100, (double) 1.0f);
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
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (short) 100, (double) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction10, (double) (short) 10, 10.0d, allowedSolution13);
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
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) 1L, (double) 10, 52);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve(52, univariateFunction7, (double) 10, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) '4', univariateFunction10, (double) (byte) 100, (double) (short) 10, allowedSolution13);
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
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction12, (double) 32, 0.0d, allowedSolution15);
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
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (double) ' ', (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getMax();
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
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) 1L, 100);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve(1, univariateFunction6, (double) 1.0f, (double) 5, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction8, (double) 0.0f, (double) 0, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) '#', univariateFunction11, (double) '#', (double) (short) 100);
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
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (double) 0.0f, (double) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (int) (short) 10);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', 52);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) '#', univariateFunction9, (double) 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, (double) 97, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((-1), univariateFunction11, (double) 10, 1.0E-15d, (double) 0.0f, allowedSolution15);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 5);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction4, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve(10, univariateFunction8, (double) (short) 10, (double) 1.0f, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) '4', (int) (byte) 100);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) 52, (double) 0, 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.solve(0, univariateFunction6, (double) 10, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        java.lang.Class<?> wildcardClass10 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        java.lang.Class<?> wildcardClass10 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) (byte) 100, univariateFunction7, 10.0d, (double) 5, 52.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 52);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction5, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve(0, univariateFunction7, (double) (short) 100, 1.0E-14d, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) 'a', 5);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) 10L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(35.0d, 0.0d, 0.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver0.solve(10, univariateFunction4, (double) 10.0f, 32.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) (byte) 100, 0.0d, (int) (short) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver4.solve((int) (short) 1, univariateFunction6, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.solve((-1), univariateFunction4, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getMax();
        double double4 = bracketingNthOrderBrentSolver0.getStartValue();
        double double5 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver4.solve(10, univariateFunction8, 100.0d, (double) (byte) 100, 97.0d, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1.0f), (double) 0L, (double) 5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, (double) (byte) 100, (int) (short) 10);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, 5);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, 100);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, 1.0d, 35.0d, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, (int) (short) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((int) (short) -1, univariateFunction5, (double) ' ', (double) (byte) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1.0f, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(100.0d, 100);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction5, (double) 100, 0.0d, (double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        double double4 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (int) ' ');
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (-1.0d), 10);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (short) -1, univariateFunction6, (double) '#', (double) 1L, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve((int) (short) 100, univariateFunction10, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, 1.0E-6d, (int) (short) 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction7, (double) (byte) 10, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, 1.0E-6d, (int) '#');
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, 5.0d, (double) (-1L), (int) 'a');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.solve((int) '4', univariateFunction6, 52.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction9, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        java.lang.Class<?> wildcardClass11 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), 52.0d, (double) (byte) 10, 52);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver4.solve((int) (short) 0, univariateFunction8, (double) (short) 100, (double) 5, (double) (-1L), allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver0.getStartValue();
        double double7 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver0.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver0.solve((int) (byte) 100, univariateFunction10, (double) 97, 10.0d, (double) '#', allowedSolution14);
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction11, 1.0E-15d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int5 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver0.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver0.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (double) 100, (double) (byte) -1, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve(0, univariateFunction7, 1.0E-6d, (double) '4', (double) (short) -1, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction9, (double) 'a', 1.0E-14d, (double) '4', allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((int) '4', univariateFunction5, (double) 'a', 32.0d, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((int) (short) 0, univariateFunction11, (double) (short) 100, (double) 10, (double) (byte) 100, allowedSolution15);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction11, (double) 10L, (double) 1L, (double) (byte) 10, allowedSolution15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), 10);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, 97);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction4, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double3 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver0.solve((-1), univariateFunction6, (double) 1L, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getMin();
        java.lang.Class<?> wildcardClass7 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) '4', univariateFunction11, 0.0d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int3 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = bracketingNthOrderBrentSolver0.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction11, (double) (short) 10, (double) 1, allowedSolution14);
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
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver0.getStartValue();
        double double7 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (double) ' ', (int) (short) 100);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0.0f, (double) 10, (double) 10L, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction5, (double) 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        double double11 = bracketingNthOrderBrentSolver2.getMax();
        java.lang.Class<?> wildcardClass12 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (double) 100, (double) (byte) -1, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction10, (double) 5, 1.0E-6d, (double) 10.0f);
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
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        double double2 = bracketingNthOrderBrentSolver0.getMin();
        double double3 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver0.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver0.solve((int) '4', univariateFunction6, (double) 10, 0.0d, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (double) 100L, (int) '4');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) (byte) 0, univariateFunction6, (double) 10, 0.0d, (double) (byte) 1, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction8, (double) 0.0f, (double) 1, (double) 10L, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction12, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction10, (double) 1.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction11, (double) 100L, (double) 0, allowedSolution14);
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
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        double double7 = bracketingNthOrderBrentSolver4.getMin();
        int int8 = bracketingNthOrderBrentSolver4.getEvaluations();
        java.lang.Class<?> wildcardClass9 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double2 = bracketingNthOrderBrentSolver0.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver0.solve(5, univariateFunction4, 100.0d, (double) 100L, 1.0E-6d, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100.0f, (double) 5, (double) 1L, 52);
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        java.lang.Class<?> wildcardClass8 = bracketingNthOrderBrentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) (byte) 100, 5);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) (short) 100, univariateFunction6, (double) (short) 0, (double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction13, (double) (-1), (double) '4', (double) (short) 1, allowedSolution17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        double double4 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver0.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver0.solve((int) (short) 0, univariateFunction7, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction12, 0.0d, 35.0d, 1.0E-6d);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double3 = bracketingNthOrderBrentSolver0.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver0.solve((int) (byte) 0, univariateFunction5, (double) (-1), 0.0d, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100, (double) 0.0f, (double) 0.0f, (int) (byte) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve((int) (byte) 0, univariateFunction6, 0.0d, 0.0d, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction13, (double) (-1), (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve(1, univariateFunction7, (double) (-1), (double) 10, (double) (byte) 100, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction5, (double) (short) 1, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction9, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver3.solve((int) (short) 10, univariateFunction9, 1.0E-14d, (double) 'a', 0.0d, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, 1.0E-14d, (double) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', 97);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.solve((-1), univariateFunction4, 1.0E-14d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, 1.0d, (double) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (double) 10, (double) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) 10L, (double) (byte) 10, (int) '4');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve(52, univariateFunction6, (double) (byte) 10, (double) 97, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
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
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass8 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 97);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction4, 0.0d, (double) 100.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, 52);
        java.lang.Class<?> wildcardClass3 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) (short) 100, (double) (short) 1, (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve((int) (short) 100, univariateFunction7, 35.0d, (double) (byte) 100, (double) 0, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        java.lang.Class<?> wildcardClass8 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver0.solve((int) ' ', univariateFunction4, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, 1.0d, (int) (byte) 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) (byte) 100, univariateFunction6, 1.0d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), 10);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction5, (double) ' ', (double) 0L, 0.0d, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 35.0d, (double) (-1L), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction10, (double) 1, (double) 97, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (int) (short) 100);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (double) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) (short) 0, univariateFunction5, (double) (byte) 1, (double) 52, 32.0d, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', 0.0d, 52);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve(0, univariateFunction5, 1.0d, 1.0E-15d, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        double double11 = bracketingNthOrderBrentSolver2.getMax();
        java.lang.Class<?> wildcardClass12 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 52, (double) (short) 100, (int) ' ');
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve(0, univariateFunction7, 0.0d, 52.0d, (double) (-1), allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction7, 32.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 52);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction6, (double) (short) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) 5, (double) (short) 100, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve((int) (byte) 0, univariateFunction7, (-1.0d), 35.0d, (double) 1, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction6, 100.0d, 100.0d, (double) 0L, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (int) (short) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((int) ' ', univariateFunction4, 0.0d, (double) 97, (double) 0.0f, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (short) -1, univariateFunction8, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (double) ' ', 97);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        double double5 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve(0, univariateFunction7, (double) 100.0f, (double) 10.0f, 100.0d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(100.0d, (double) 0.0f, (double) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int12 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction14, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction9, 1.0E-14d, (double) (byte) 10, (double) 5, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction9, (-1.0d), (double) 100L, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, 1.0E-6d, (int) (short) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) ' ', univariateFunction5, 1.0d, (double) (short) 10, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction11, 32.0d, (double) 0.0f, (double) (byte) -1);
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
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (double) (byte) 100, (double) (-1), (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve(5, univariateFunction7, (double) ' ', (double) (short) 10, (-1.0d), allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bracketingNthOrderBrentSolver2.solve((int) (short) -1, univariateFunction15, 10.0d, (double) ' ', (double) ' ');
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
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction9, (double) 1.0f, (double) 52, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver0.solve(5, univariateFunction6, 1.0d, (double) (-1.0f), allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) 10, 52);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve(5, univariateFunction5, 0.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver3.solve(52, univariateFunction10, (double) (byte) -1, (double) 1L, (double) (byte) -1, allowedSolution14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (int) (short) 10);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((-1), univariateFunction5, 10.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver3.solve((int) (byte) 100, univariateFunction9, (double) 'a', 0.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction8, (double) (-1L), 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, 97.0d, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double4 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) (byte) 1, (double) (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (-1.0d), (double) (-1), (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double3 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve(32, univariateFunction7, (double) (-1.0f), (double) (byte) 0, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction10, (-1.0d), (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction11, (-1.0d), (double) 0.0f);
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
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction13, (double) (byte) 100, 32.0d, allowedSolution16);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, 0.0d, 100);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (short) -1, univariateFunction6, (double) (-1L), (double) 10.0f, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', (double) (byte) 100, (double) 100L, (int) (byte) 100);
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve((int) (short) 100, univariateFunction8, (double) 100L, 1.0E-6d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver4.solve((int) (byte) -1, univariateFunction9, 10.0d, (double) (byte) 10, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction12, 1.0E-6d, 5.0d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 0, (double) 'a', 100.0d, 5);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver4.solve((int) (byte) 1, univariateFunction6, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve(1, univariateFunction9, (double) ' ', 52.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1.0f), (double) (-1), (double) (short) -1, 100);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.solve(10, univariateFunction7, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction6, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver3.solve(0, univariateFunction10, (double) ' ', (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction8, 100.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) 'a', 5);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve(10, univariateFunction6, (double) 10L, 100.0d, (double) (short) 1, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1.0f), 10);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100.0f, (int) (short) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction4, (double) 0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) 100, (double) 'a', 10);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getStartValue();
        int int8 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver4.solve(1, univariateFunction10, (double) 10L, (double) '4', 1.0E-6d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver3.solve(1, univariateFunction10, (double) 0L, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, 97.0d, (int) '4');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve((-1), univariateFunction5, 0.0d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getMin();
        double double7 = bracketingNthOrderBrentSolver3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (int) (short) 10);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, 97.0d, (int) (short) 100);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 0.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, (double) 0L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getStartValue();
        int int5 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver0.solve((int) '#', univariateFunction7, (double) 1, (double) (short) 10, allowedSolution10);
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
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (double) 5, (double) 1L, 100);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver4.solve((int) (byte) 100, univariateFunction7, (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) (byte) 100, 52);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) '4', (double) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getMin();
        double double4 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver0.solve(5, univariateFunction6, 32.0d, 0.0d, (double) 10L);
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
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction7, 35.0d, 1.0E-15d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (-1.0d), (double) 10.0f, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (int) 'a');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction4, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        java.lang.Class<?> wildcardClass4 = bracketingNthOrderBrentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
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
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(10.0d, (double) 52, 35.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double3 = bracketingNthOrderBrentSolver0.getMin();
        int int4 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver0.solve((-1), univariateFunction7, (double) 0L, 1.0E-6d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, (int) '4');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction4, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        double double12 = bracketingNthOrderBrentSolver2.getStartValue();
        int int13 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        double double6 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver3.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver3.solve(1, univariateFunction9, 1.0d, 5.0d, 0.0d, allowedSolution13);
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
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) 100, (double) 'a', 10);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction13, (double) 1);
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
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction11, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(100.0d, (double) 5, (double) 97, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction8, (double) 1, (double) (-1L), allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (double) 10.0f, (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) 5, (double) (short) 100, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) ' ', univariateFunction7, 0.0d, (double) 0L, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(97, univariateFunction9, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0.0f, 10.0d, (int) (short) 100);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (short) -1, univariateFunction7, (double) 0L, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction10, (double) 100, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100L, (int) (byte) 100);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve(52, univariateFunction6, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getStartValue();
        int int11 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction13, (double) 52);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (double) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(1, univariateFunction10, (double) (short) 10, (double) (-1.0f), allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1L, (double) 0, (double) 100L, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve((int) (byte) 100, univariateFunction7, (double) 5, (double) ' ', (double) 1.0f, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, (double) 100, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) 100, (int) (byte) 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (byte) 100, univariateFunction6, (double) 0.0f, (double) '4', allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        java.lang.Class<?> wildcardClass7 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        double double4 = bracketingNthOrderBrentSolver0.getMin();
        double double5 = bracketingNthOrderBrentSolver0.getStartValue();
        int int6 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver0.getMax();
        int int8 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver0.solve(1, univariateFunction10, (double) (-1L), (double) 0.0f, (double) 97, allowedSolution14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (double) (byte) 10, 1.0E-6d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction6, (double) 0.0f, 1.0E-14d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) 100, (int) (byte) 10);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve(32, univariateFunction7, (double) 10, (double) 10, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1.0f, (double) 100L, (int) 'a');
        java.lang.Class<?> wildcardClass4 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (-1.0d), 5);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction10, 0.0d, (double) 1.0f, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', (double) (byte) 100, (double) 100L, (int) (byte) 100);
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
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction9, (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (double) ' ', (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        double double6 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) (byte) -1, univariateFunction8, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (short) 0, univariateFunction11, (double) 5, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (double) (-1), 0.0d, (int) '4');
        double double5 = bracketingNthOrderBrentSolver4.getStartValue();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) (byte) 10, univariateFunction7, 5.0d, (double) 32, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) ' ', (int) '#');
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction9, (double) ' ', 97.0d, 0.0d, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1.0f, (int) (short) 10);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction5, (double) 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 0.0d, (int) '4');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve((int) 'a', univariateFunction5, (double) (short) 0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) 1L, (double) 10, 52);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) (byte) 100, (int) (byte) 10);
    }
}

