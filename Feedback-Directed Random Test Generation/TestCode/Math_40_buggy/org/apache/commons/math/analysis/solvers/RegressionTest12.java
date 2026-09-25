package org.apache.commons.math.analysis.solvers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
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
        double double10 = bracketingNthOrderBrentSolver0.getMax();
        int int11 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int12 = bracketingNthOrderBrentSolver0.getMaximalOrder();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', 1.0E-6d, 10);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
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
        double double10 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        double double11 = bracketingNthOrderBrentSolver0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction11, (double) '4');
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (double) (short) 10, (double) 1, 97);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction11, (double) (-1L), (double) 0.0f, allowedSolution14);
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
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.doSolve();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        java.lang.Class<?> wildcardClass9 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver0.getMax();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100, (double) '#', 100);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        double double11 = bracketingNthOrderBrentSolver2.getMax();
        double double12 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction14, (double) 100L, (double) (byte) -1, (double) 52);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', (double) (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double4 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) (short) 0, 97.0d, 35);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction12, (double) 10L, 35.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) (byte) 10, (int) ' ');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver3.solve(97, univariateFunction5, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(97, univariateFunction7, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (double) ' ', 97);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
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
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction7, 100.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 35, (double) (byte) 100, (int) (byte) 10);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        double double6 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) '4', univariateFunction11, (double) (short) -1, (double) 97, (double) 1.0f);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
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
        double double13 = bracketingNthOrderBrentSolver2.getStartValue();
        java.lang.Class<?> wildcardClass14 = bracketingNthOrderBrentSolver2.getClass();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction9, (double) (short) 0, (double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double12 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double13 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver0.solve(35, univariateFunction10, (double) 52);
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
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) (short) 0, 97.0d, 35);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(52.0d, (double) (short) 1, (double) (short) 1, (int) (short) 10);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (double) 10L, (int) '#');
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double3 = bracketingNthOrderBrentSolver0.getMax();
        int int4 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver0.solve((int) (byte) 0, univariateFunction6, 100.0d, 0.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (double) 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        double double4 = bracketingNthOrderBrentSolver0.getMin();
        double double5 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (int) '#');
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getMin();
        double double7 = bracketingNthOrderBrentSolver3.getMin();
        int int8 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver3.getMax();
        double double10 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getStartValue();
        double double5 = bracketingNthOrderBrentSolver0.getMax();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve(35, univariateFunction13, (double) 5);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        double double6 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve(1, univariateFunction12, (double) 35, 0.0d, (double) 32, allowedSolution16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) 1.0f, (int) (short) 10);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) '4', 0.0d, (int) ' ');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getStartValue();
        double double7 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver4.solve((int) (short) 100, univariateFunction9, 1.0E-6d, 0.0d, 1.0E-15d, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
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
        double double12 = bracketingNthOrderBrentSolver2.getMax();
        java.lang.Class<?> wildcardClass13 = bracketingNthOrderBrentSolver2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), 0.0d, (double) 1.0f, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getStartValue();
        double double6 = bracketingNthOrderBrentSolver4.getStartValue();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) '#');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) (short) 0, univariateFunction7, (double) ' ', 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction6, (double) 1.0f, (double) 10L, (double) 0.0f, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) 10.0f, (double) 100.0f, (int) (short) 10);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, (double) 1.0f, (double) (short) -1, (int) (short) 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, (double) 0.0f, 0.0d, 35);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100L, (int) (byte) 100);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve(35, univariateFunction7, (double) 52, (double) 32, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) (short) 0, (double) (-1L), 35);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(32, univariateFunction6, (double) (short) 0, 97.0d, 52.0d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(52.0d, (double) 97, (double) (short) 100, 52);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) '#', univariateFunction8, 100.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (int) '4');
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve((int) (short) 0, univariateFunction5, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, (double) 35, (double) 97, 5);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (double) 100.0f, (double) 10L, 100);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
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
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, 97.0d, (double) 10L, (int) '#');
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve((int) '#', univariateFunction8, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) 35, 35);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        double double11 = bracketingNthOrderBrentSolver2.getMax();
        double double12 = bracketingNthOrderBrentSolver2.getStartValue();
        double double13 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) 1.0f, (int) 'a');
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve((int) (short) -1, univariateFunction10, 1.0E-14d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1.0f), 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', 1.0E-6d, (double) 1L, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getStartValue();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) 97, (int) '#');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve(35, univariateFunction5, (double) 10L, (double) 'a', 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', 100);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, 5.0d, 5);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction10, (double) '#', (double) (byte) 0, (double) (byte) 1, allowedSolution14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        double double11 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction13, (double) (-1.0f));
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) 5, (double) (short) 100, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        double double6 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 0.0f, (double) 1.0f, (int) '4');
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        double double11 = bracketingNthOrderBrentSolver2.getMin();
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
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver3.getStartValue();
        int int8 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getMax();
        double double4 = bracketingNthOrderBrentSolver0.getStartValue();
        double double5 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (int) '#');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver2.solve((int) (short) 0, univariateFunction4, (double) 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, (double) 10.0f, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) 'a', 5);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver3.getStartValue();
        int int9 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver3.solve((int) '#', univariateFunction11, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, 5.0d, 32);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) (-1), (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
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
        int int12 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve((-1), univariateFunction14, (double) (-1), (double) 52, allowedSolution17);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 52.0d, (int) 'a');
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        double double11 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver3.solve(1, univariateFunction9, (double) (byte) 1, 0.0d, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, 0.0d, (int) (byte) 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction9, (double) (-1L), (double) 'a', 52.0d, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
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
        double double13 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction15, (double) (short) -1, (double) (-1));
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 100);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction6, 0.0d, 52.0d, (double) 1.0f, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver3.getStartValue();
        double double7 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 5);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction6, (double) 10.0f, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, (int) (short) 10);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (double) (short) -1, (double) 0L, 100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction10, (double) 0, 1.0E-15d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int11 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction13, (double) (-1L), (double) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), 52.0d, (double) (byte) 10, 52);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve((int) (short) 10, univariateFunction8, (double) (-1), (double) (short) 100, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        double double12 = bracketingNthOrderBrentSolver2.getMin();
        java.lang.Class<?> wildcardClass13 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction13, (double) ' ', 0.0d);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, (double) 0.0f, (double) (byte) 1, 97);
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
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
        double double14 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getMax();
        java.lang.Class<?> wildcardClass13 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction11, (double) ' ', (double) (byte) 1, (double) 100, allowedSolution15);
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
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, (double) (byte) 1, (double) '4', 97);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) '#');
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
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
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver0.solve((int) (short) -1, univariateFunction11, (double) 52, 1.0E-14d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, 0.0d, (double) ' ', (int) '4');
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
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
        double double12 = bracketingNthOrderBrentSolver2.getMin();
        int int13 = bracketingNthOrderBrentSolver2.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver0.getStartValue();
        double double7 = bracketingNthOrderBrentSolver0.getMax();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve(97, univariateFunction13, 52.0d);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction12, (double) 0, 32.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1.0f), 10);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
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
        double double12 = bracketingNthOrderBrentSolver2.getMax();
        double double13 = bracketingNthOrderBrentSolver2.getStartValue();
        double double14 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction16, (-1.0d), (double) 'a', allowedSolution19);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double13 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction15, (double) (short) 0);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, 97);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double3 = bracketingNthOrderBrentSolver0.getMin();
        int int4 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        int int6 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, 0.0d, (double) 100.0f, (int) (byte) 10);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 32.0d, (double) (byte) 1, 97);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (double) 0L, 97);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve(5, univariateFunction6, (double) (byte) 1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction7, (double) 52, (double) 10.0f, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver0.getStartValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver0.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver0.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (double) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, (double) 32, 10);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, (int) (short) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction5, 52.0d, 0.0d, (double) 0L, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve(1, univariateFunction13, (double) (-1L), (double) (short) 100, (double) 10.0f);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), 52.0d, (double) (byte) 10, 52);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        int int6 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver4.getMax();
        double double8 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) 100.0f, (double) 10, 100);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) 5, 5);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        double double7 = bracketingNthOrderBrentSolver4.getMin();
        double double8 = bracketingNthOrderBrentSolver4.getStartValue();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (byte) 1, (double) 10, 52);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1L, 32);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 10.0d, 5.0d, (int) (short) 10);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) 0L, 100);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) '4', univariateFunction9, (double) '#', 1.0E-14d, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
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
        int int14 = bracketingNthOrderBrentSolver2.getMaximalOrder();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, 97);
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) 5, (int) (byte) 100);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, 1.0E-6d, 0.0d, (int) (byte) 100);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver3.getMax();
        int int10 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double12 = bracketingNthOrderBrentSolver2.getMax();
        double double13 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
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
        double double10 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) '#', (int) (short) 10);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
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
        double double12 = bracketingNthOrderBrentSolver2.getMax();
        double double13 = bracketingNthOrderBrentSolver2.getStartValue();
        double double14 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double15 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 32, (double) 5, (int) (byte) 10);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (short) 0, univariateFunction9, (double) 10.0f, (double) (byte) 1, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 1.0E-14d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver3.solve(100, univariateFunction10, 5.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) '#', (double) (short) 1, 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver4.solve((int) (short) 0, univariateFunction8, 5.0d, 97.0d, (double) (-1), allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) 97, 1.0E-15d, 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getMax();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int9 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double10 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', 1.0E-6d, (int) (byte) 100);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(100.0d, (double) (byte) 10, (int) 'a');
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, 1.0d, (double) 32, (int) (byte) 100);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(52.0d, (double) 0, 32);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), (double) (byte) 10, 10.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) (short) -1, univariateFunction6, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', 1.0E-6d, 10);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1L, (double) 'a', (double) (short) -1, (int) (short) 10);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1L, (double) 1L, (double) 52, (int) 'a');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve((int) (short) 100, univariateFunction6, (double) (short) -1, (double) 0.0f, (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, 1.0d, 0.0d, 52);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, 1.0E-14d, 100);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve(35, univariateFunction7, (double) (byte) 100, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, 52);
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction7, (double) 0L, (double) '#', allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) '#');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (int) (short) 100);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 0, (double) 52, (double) 1L, (int) (short) 10);
        double double5 = bracketingNthOrderBrentSolver4.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve((int) ' ', univariateFunction7, 10.0d, 1.0d, (double) 100.0f, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, 97);
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction5, (double) 10, 0.0d, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction11, (double) 35);
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
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) (short) 100, (double) (short) 1, (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(97, univariateFunction7, (double) 0, (double) 1L, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
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
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction16, (double) 0L, (-1.0d));
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve(35, univariateFunction14, (double) 1L, (double) (byte) 1, allowedSolution17);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (int) '#');
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, (double) 100, (double) 1.0f, 10);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(10.0d, (double) '4', (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, (int) (short) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction5, 32.0d, 100.0d, 0.0d, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (double) 52, 35.0d, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(100.0d, (double) (short) 1, (double) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, (double) 52, (double) (byte) -1, 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve((int) (byte) 100, univariateFunction6, 52.0d, (double) 1L, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        double double6 = bracketingNthOrderBrentSolver3.getMax();
        double double7 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, 52);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction5, (double) 1L, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) (short) 100, (int) ' ');
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) (byte) 100, (double) ' ', (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver4.getStartValue();
        int int8 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, (int) ' ');
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100.0f, (double) 1, (double) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1L, (double) (short) 100, (int) (short) 10);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
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
        int int14 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double15 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int16 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double17 = bracketingNthOrderBrentSolver2.getMax();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-15d + "'", double15 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (int) ' ');
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction8, (double) 100.0f, (double) (byte) 0, (double) (short) -1, allowedSolution12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction5, (double) 1L, (double) 0.0f, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) ' ', univariateFunction11, 32.0d, (double) '4', 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, 32.0d, (int) (short) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve((int) (short) 0, univariateFunction5, 32.0d, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) 'a', (int) (short) 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver3.solve((int) '#', univariateFunction10, (double) (byte) 1, (double) 0L, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) 100, (double) 'a', 10);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver4.solve((int) (byte) 0, univariateFunction9, 0.0d, 1.0d, (double) 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) 100, (int) (byte) 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(10.0d, 1.0E-14d, (double) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, 52);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 5);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction4, (double) (byte) 10, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getMin();
        double double4 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), (double) (-1.0f), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, 52);
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 52, 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver3.getStartValue();
        double double8 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (double) 10, (int) (short) 100);
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
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
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction14, (double) 0.0f, 1.0E-14d);
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
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 52, 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver3.solve(1, univariateFunction9, (double) (byte) 100, (double) 10, (double) 1.0f, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        double double4 = bracketingNthOrderBrentSolver0.getMin();
        double double5 = bracketingNthOrderBrentSolver0.getStartValue();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 10, (double) 32, (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver0.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver0.solve((int) (byte) 1, univariateFunction8, 32.0d, (double) 10L, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getMax();
        double double4 = bracketingNthOrderBrentSolver0.getStartValue();
        double double5 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver0.solve(35, univariateFunction9, (double) 'a', (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0.0f, (double) (byte) 100, (double) 0.0f, (int) (short) 10);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        double double10 = bracketingNthOrderBrentSolver2.getStartValue();
        double double11 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (-1.0d), 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve(0, univariateFunction6, (double) 0, (double) 10L, (double) 1.0f, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction8, (double) '4', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 35, (double) (byte) 100, (int) (byte) 10);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve(97, univariateFunction6, (double) 1L, (double) (-1), (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, (double) 1.0f, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getMin();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
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
        int int12 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double13 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int14 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int15 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int16 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double17 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-15d + "'", double17 == 1.0E-15d);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (double) 10, (int) (short) 100);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, (double) '#', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) 10, 10);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, 32.0d, (-1.0d), (int) (short) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver4.solve((int) '#', univariateFunction6, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), (double) '#', (-1.0d), 97);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, 97.0d, 100);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(10.0d, 0.0d, (-1.0d), (int) '#');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, 1.0E-15d, (int) '#');
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        double double6 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) 5, (double) (short) 100, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, 32.0d, (double) (byte) 0, 52);
        double double5 = bracketingNthOrderBrentSolver4.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve((int) 'a', univariateFunction7, (double) 100.0f, 1.0E-14d, (double) 35, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction7, (double) 0, (double) 10L, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (double) 100L, (double) '4', 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver4.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver4.solve(0, univariateFunction10, 1.0d, (double) 1L, (double) 1, allowedSolution14);
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
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 1.0d, 97);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver3.solve(100, univariateFunction9, 0.0d, (double) '4', (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
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
        double double13 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
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
        double double12 = bracketingNthOrderBrentSolver2.getMax();
        double double13 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction15, (double) (byte) 0, (double) (short) 10);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 0, (double) 'a', 5);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction11, (double) 0L, (double) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
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
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction17 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction17, (double) 97, (double) 100, allowedSolution20);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-15d + "'", double14 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) ' ', (double) (-1), (int) 'a');
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) 10.0f, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver0.solve(1, univariateFunction7, (double) (short) 100, (-1.0d), 52.0d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (short) -1, univariateFunction11, (double) 100.0f, 0.0d, allowedSolution14);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', (double) (byte) 100, (double) 100L, (int) (byte) 100);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
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
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve(97, univariateFunction13, (double) 32, (double) 97, allowedSolution16);
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
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver3.getMax();
        double double9 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.0d + "'", double9 == 5.0d);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(32.0d, (double) 10.0f, (double) 10L, 5);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve(5, univariateFunction8, (double) 32, 0.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, 10);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
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
        double double12 = bracketingNthOrderBrentSolver2.getStartValue();
        int int13 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 0, (double) 0L, (int) (byte) 10);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver3.solve(10, univariateFunction10, (double) (short) 1, 32.0d, (double) (byte) 100, allowedSolution14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, (int) '4');
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, (double) 0.0f, (int) (short) 10);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
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
        double double12 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double13 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 97);
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        java.lang.Class<?> wildcardClass9 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 1.0d, 97);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getStartValue();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) 0, 1.0E-15d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction6, (double) 10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (double) ' ', 97);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, 35);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) '#');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, 52);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction4, (double) (byte) 100, (double) 10L, allowedSolution7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
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
        int int15 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction17, (double) 100L);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (double) (byte) -1, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        double double6 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) '4', 10);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) (byte) 1, (double) (-1.0f), 10);
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(10.0d, (double) (short) 100, (double) (short) -1, (int) (short) 100);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
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
        double double15 = bracketingNthOrderBrentSolver2.getMin();
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
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) 100, (int) '4');
        java.lang.Class<?> wildcardClass4 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, 97.0d, (double) (byte) 100, 32);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, 97);
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (byte) -1, 100);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (double) (byte) 1, 1.0d, 32);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getStartValue();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, 0.0d, (int) (byte) 10);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) '4', univariateFunction6, 0.0d, (double) (short) 100, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', (double) 0L, 10.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, 100.0d, (int) (byte) 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver3.getMin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, (double) (-1L), (double) (short) 100, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getStartValue();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((int) (short) 1, univariateFunction7, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, 97);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(52, univariateFunction10, (double) 1L, (double) 1L);
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
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, (double) (short) 1, (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 0, 5);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) '4', (double) 0.0f, 5);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 1.0E-15d, (double) (byte) 1, 100);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve((int) (short) 1, univariateFunction7, (double) (-1.0f), (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction8, 0.0d, 0.0d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0.0f, (double) (byte) -1, (int) (byte) 10);
        int int4 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve((int) ' ', univariateFunction6, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, 1.0d, (double) (byte) 1, (int) '#');
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (short) 10, (double) 1.0f, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 35, (double) ' ', (int) 'a');
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, 1.0E-6d, (int) '#');
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve(32, univariateFunction6, 97.0d, 35.0d, (double) 100.0f, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int12 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double2 = bracketingNthOrderBrentSolver0.getMax();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver0.solve(0, univariateFunction6, 10.0d, (double) 'a', 100.0d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, (double) 10, (double) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, 32);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) 100, (int) (byte) 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        double double6 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int8 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver3.solve(1, univariateFunction10, 0.0d, (double) 100L, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 5, 1.0E-14d, 5);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (double) (byte) 0, (double) (short) 0, 52);
        double double5 = bracketingNthOrderBrentSolver4.getStartValue();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve((int) (short) -1, univariateFunction9, 32.0d, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (-1.0d), (double) 32, 10);
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, 1.0d, (double) 32, (int) (byte) 100);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 1.0d, 97);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        double double6 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver3.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve((int) (short) 10, univariateFunction9, 0.0d, (double) 0);
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
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (double) 100L, (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        int int6 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver3.getMax();
        int int8 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int9 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6d, (double) 100.0f, (double) (short) 1, 97);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, 0.0d, 0.0d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        double double6 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver4.getMax();
        double double10 = bracketingNthOrderBrentSolver4.getMax();
        double double11 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double12 = bracketingNthOrderBrentSolver4.getStartValue();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass12 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (double) 52, 10);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction11, (double) 32, (double) 10L, (double) 100.0f);
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
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, 10);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(5, univariateFunction6, 1.0E-15d, (double) (byte) 1, (double) ' ', allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (-1), (double) 32, (int) (byte) 10);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, (double) 1.0f, 100);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, 1.0E-6d, 0.0d, (int) (byte) 100);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
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
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getMin();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (double) 1L, 97);
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) '4', univariateFunction7, (double) (byte) 100, (double) ' ', allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, (double) (-1L), (double) 1.0f, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, (double) 32, (int) 'a');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve((int) (byte) 0, univariateFunction5, 100.0d, (double) (short) 0, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
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
        int int12 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double13 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int14 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int15 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int16 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int17 = bracketingNthOrderBrentSolver2.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, 32);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction4, 1.0E-14d, (double) 10.0f, 5.0d, allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) 100, (-1.0d), 5);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve((int) (byte) 100, univariateFunction13, (double) (short) 100, 1.0E-15d, (double) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double2 = bracketingNthOrderBrentSolver0.getMax();
        int int3 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double4 = bracketingNthOrderBrentSolver0.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver0.solve((int) (short) 10, univariateFunction6, (double) (short) 1, (double) (short) 100, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) 100.0f, (int) (byte) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver3.solve((int) (byte) 10, univariateFunction5, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bracketingNthOrderBrentSolver2.solve((int) (byte) 10, univariateFunction10, 5.0d, (double) 35, (double) (-1.0f), allowedSolution14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, 97);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) '#');
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve((int) (byte) 0, univariateFunction4, (double) (byte) 10, 0.0d, (double) (-1L), allowedSolution8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, (double) 0L, 1.0d, 100);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '4', (int) '4');
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
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
        int int13 = bracketingNthOrderBrentSolver2.getMaximalOrder();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 0, (double) '#', (double) (short) 10, 10);
        double double5 = bracketingNthOrderBrentSolver4.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve((int) 'a', univariateFunction7, (double) 'a', 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100.0f, (double) (byte) 10, (double) (byte) 10, (int) '#');
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
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
        int int12 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double13 = bracketingNthOrderBrentSolver2.getMax();
        double double14 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-15d + "'", double14 == 1.0E-15d);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double11 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 100L, (double) ' ', (int) (short) 100);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver3.solve(10, univariateFunction7, 32.0d, (double) 0.0f, 52.0d, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1L, (double) 1.0f, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1.0f), (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(35.0d, (double) 97, (double) (short) -1, 35);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve(5, univariateFunction6, 5.0d, (double) 5, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, 1.0E-14d, 100);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        double double5 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double6 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 0, (double) (-1), 1.0d, 100);
        int int5 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0d, 0.0d, 35);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver3.solve((int) (short) 0, univariateFunction5, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
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
        double double13 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int14 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int15 = bracketingNthOrderBrentSolver2.getMaximalOrder();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMin();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', 1.0d, 52.0d, (int) (byte) 100);
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve((int) (byte) -1, univariateFunction8, 5.0d, (double) (-1.0f), 32.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve((int) (short) 10, univariateFunction7, (double) (byte) 100, 0.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(35.0d, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) '#', (int) (byte) 10);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', 0.0d, 52);
        double double4 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve((int) '#', univariateFunction6, (double) ' ', (double) 1.0f, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 0, (double) '4', (double) (byte) 10, 32);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        double double9 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 100, (double) (byte) -1, (double) (byte) 0, (int) ' ');
        double double5 = bracketingNthOrderBrentSolver4.getStartValue();
        double double6 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve((int) 'a', univariateFunction10, 32.0d, (double) (byte) -1);
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
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, 52.0d, 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve(5, univariateFunction5, 97.0d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, 0.0d, 32);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (double) 10.0f, 97);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) 97, (int) '#');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getStartValue();
        java.lang.Class<?> wildcardClass11 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double3 = bracketingNthOrderBrentSolver0.getStartValue();
        double double4 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver0.getMin();
        double double7 = bracketingNthOrderBrentSolver0.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver0.solve(0, univariateFunction9, (double) (byte) 100, (double) (-1.0f), (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int12 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, (double) (-1L), (double) (short) -1, 5);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 1, 10.0d, (int) 'a');
        int int4 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver3.getMin();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver3.solve((int) (byte) 10, univariateFunction10, (double) (byte) 0, 0.0d, (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getStartValue();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getStartValue();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (double) 0.0f, (double) 5, 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver4.solve((int) ' ', univariateFunction6, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, 1.0E-14d, 1.0d, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double11 = bracketingNthOrderBrentSolver2.getMin();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve((int) (short) 100, univariateFunction13, 5.0d, (double) (-1.0f), allowedSolution16);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
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
        double double13 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double14 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, (double) 0.0f, (double) 5, 100);
        double double5 = bracketingNthOrderBrentSolver4.getMax();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, 10.0d, (double) 35, (int) (short) 100);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, (double) (byte) 0, 97);
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, (double) 1, (int) (byte) 10);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve((int) (short) 10, univariateFunction6, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, 0.0d, (double) (short) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        int int9 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double11 = bracketingNthOrderBrentSolver2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10L, 100);
        double double3 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction10, (double) 0.0f, (double) (byte) 1, allowedSolution13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int7 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getMin();
        double double10 = bracketingNthOrderBrentSolver2.getMax();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, 5);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 1.0d, 97);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver3.solve(5, univariateFunction7, (double) (short) 10, 1.0E-14d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        double double8 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, (double) 1L, 52);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(100, univariateFunction9, (double) 100.0f, 35.0d, (double) 'a');
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
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMax();
        int int7 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double8 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getStartValue();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        java.lang.Class<?> wildcardClass12 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 1.0d, 97);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        int int7 = bracketingNthOrderBrentSolver3.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver3.getMax();
        double double9 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver2.solve(10, univariateFunction9, (double) 0.0f, 5.0d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, (double) 1, (int) (byte) 10);
        double double4 = bracketingNthOrderBrentSolver3.getMax();
        int int5 = bracketingNthOrderBrentSolver3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) ' ', univariateFunction7, (double) (short) 100, 0.0d, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int2 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int3 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getStartValue();
        java.lang.Class<?> wildcardClass5 = bracketingNthOrderBrentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
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
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction13, (double) 1L, 1.0E-15d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, (double) (short) 10, 5.0d, 10);
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        double double6 = bracketingNthOrderBrentSolver4.getMin();
        double double7 = bracketingNthOrderBrentSolver4.getMin();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int1 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double2 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int3 = bracketingNthOrderBrentSolver0.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
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
        int int12 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getStartValue();
        int int8 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        double double11 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double12 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bracketingNthOrderBrentSolver2.solve((int) (byte) 1, univariateFunction14, (double) '4', (double) (byte) 1, (double) 1.0f);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1.0f), (double) 0.0f, (-1.0d), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double11 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 1, (double) (byte) 100, (double) (-1), (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (double) 100, (int) '4');
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1.0d), (int) (byte) 100);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int4 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        java.lang.Class<?> wildcardClass6 = bracketingNthOrderBrentSolver2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0, 1.0E-6d, (int) (short) 10);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) 100, (double) 'a', 10);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, (double) 'a', (int) (short) 10);
        double double4 = bracketingNthOrderBrentSolver3.getMin();
        double double5 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (-1.0d), 10);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver0.solve((int) (byte) 1, univariateFunction7, (double) (byte) 1, (double) 10, (double) (byte) -1, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 35, (double) (byte) 100, (int) (byte) 10);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
        double double5 = bracketingNthOrderBrentSolver3.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver3.solve((int) (byte) -1, univariateFunction7, (double) 10.0f, (double) (short) 0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10.0f, (double) (-1), (double) (short) 0, (int) '#');
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
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
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver0.solve((int) (short) 0, univariateFunction6, (double) '4', 1.0E-14d, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double10 = bracketingNthOrderBrentSolver2.getRelativeAccuracy();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int12 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1), (double) 100.0f, 5);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver3.solve(52, univariateFunction5, 0.0d, (double) ' ', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) (byte) 100, (double) 'a', 10);
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getStartValue();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        int int9 = bracketingNthOrderBrentSolver4.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bracketingNthOrderBrentSolver4.solve((int) (short) 1, univariateFunction11, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (double) 0L, 100);
        double double4 = bracketingNthOrderBrentSolver3.getRelativeAccuracy();
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
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        int int3 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        int int4 = bracketingNthOrderBrentSolver0.getEvaluations();
        int int5 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int7 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) 'a', 5);
        int int4 = bracketingNthOrderBrentSolver3.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver3.getStartValue();
        int int6 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        double double7 = bracketingNthOrderBrentSolver3.getStartValue();
        double double8 = bracketingNthOrderBrentSolver3.getMin();
        int int9 = bracketingNthOrderBrentSolver3.getEvaluations();
        int int10 = bracketingNthOrderBrentSolver3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (double) (short) 100, (double) 1, (int) 'a');
        int int5 = bracketingNthOrderBrentSolver4.getEvaluations();
        int int6 = bracketingNthOrderBrentSolver4.getEvaluations();
        int int7 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        double double8 = bracketingNthOrderBrentSolver4.getStartValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0d, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double3 = bracketingNthOrderBrentSolver2.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(5.0d, (double) 1.0f, (int) (byte) 100);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver3.solve((int) (byte) 10, univariateFunction5, (double) (byte) 100, 1.0E-14d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (double) 10, 100.0d, (int) (byte) 10);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        int int9 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction11, (-1.0d), (double) 100L);
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
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        int int12 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double13 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        int int4 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double5 = bracketingNthOrderBrentSolver2.getStartValue();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver2.solve(32, univariateFunction8, 0.0d, (double) 10L, allowedSolution11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) -1, (double) 10.0f, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (2)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) -1, 5);
        int int3 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bracketingNthOrderBrentSolver2.solve(1, univariateFunction5, (double) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double6 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int8 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double9 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) '#', (double) (byte) 100, (double) (byte) 10, (int) '4');
        double double5 = bracketingNthOrderBrentSolver4.getRelativeAccuracy();
        int int6 = bracketingNthOrderBrentSolver4.getMaximalOrder();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bracketingNthOrderBrentSolver4.solve((int) (byte) 10, univariateFunction8, (double) 52, (double) 1.0f, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 0, 10);
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getStartValue();
        int int5 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int6 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double9 = bracketingNthOrderBrentSolver2.getMax();
        double double10 = bracketingNthOrderBrentSolver2.getMin();
        double double11 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (-1L), (double) 1L, (double) 0.0f, 35);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bracketingNthOrderBrentSolver4.solve((int) (byte) 1, univariateFunction6, (double) 0.0f, 0.0d, allowedSolution9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 52, 32);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 10, 0.0d, (double) '#', 10);
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', 35.0d, 1.0E-6d, (int) (short) 100);
        double double5 = bracketingNthOrderBrentSolver4.getAbsoluteAccuracy();
        double double6 = bracketingNthOrderBrentSolver4.getStartValue();
        double double7 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 0L, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double6 = bracketingNthOrderBrentSolver2.getStartValue();
        double double7 = bracketingNthOrderBrentSolver2.getMax();
        double double8 = bracketingNthOrderBrentSolver2.getMin();
        double double9 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int10 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int11 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        int int12 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (byte) 10, (int) 'a');
        int int3 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double4 = bracketingNthOrderBrentSolver2.getMin();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        double double6 = bracketingNthOrderBrentSolver2.getMin();
        double double7 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        double double8 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        int int9 = bracketingNthOrderBrentSolver2.getMaximalOrder();
        double double10 = bracketingNthOrderBrentSolver2.getStartValue();
        int int11 = bracketingNthOrderBrentSolver2.getMaxEvaluations();
        double double12 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(97.0d, (int) (byte) 10);
        double double3 = bracketingNthOrderBrentSolver2.getStartValue();
        double double4 = bracketingNthOrderBrentSolver2.getFunctionValueAccuracy();
        int int5 = bracketingNthOrderBrentSolver2.getEvaluations();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver2.solve(35, univariateFunction7, (double) 10, (double) 10, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 35, (int) (short) 10);
        double double3 = bracketingNthOrderBrentSolver2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 'a', (double) (byte) 100, (double) 100L, (int) (byte) 100);
        int int5 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        int int6 = bracketingNthOrderBrentSolver4.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 97, (double) 10, 100.0d, (int) (byte) 10);
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve(52, univariateFunction6, (double) 10, (double) (byte) 10, (double) 0L, allowedSolution10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) (short) 100, (double) 100, (int) ' ');
        double double4 = bracketingNthOrderBrentSolver3.getStartValue();
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
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 10, (double) 32, 1.0E-15d, (int) 'a');
        double double5 = bracketingNthOrderBrentSolver4.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver4.solve((int) (byte) 100, univariateFunction7, (double) 97, (double) (-1.0f), (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 1, (double) (-1L), (int) (short) 100);
        double double4 = bracketingNthOrderBrentSolver3.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-14d, 97);
        double double3 = bracketingNthOrderBrentSolver2.getAbsoluteAccuracy();
        double double4 = bracketingNthOrderBrentSolver2.getMax();
        double double5 = bracketingNthOrderBrentSolver2.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bracketingNthOrderBrentSolver2.solve(0, univariateFunction7, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double1 = bracketingNthOrderBrentSolver0.getMax();
        int int2 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        double double3 = bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
        int int4 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
        double double5 = bracketingNthOrderBrentSolver0.getMax();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bracketingNthOrderBrentSolver0.solve((-1), univariateFunction7, (double) (-1), 0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((double) 35, (double) 1.0f, 35.0d, 52);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bracketingNthOrderBrentSolver4.doSolve();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }
}

