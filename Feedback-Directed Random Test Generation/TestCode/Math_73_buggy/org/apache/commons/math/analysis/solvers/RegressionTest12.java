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
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (-1));
        brentSolver0.resetMaximalIterationCount();
        int int13 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(0);
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.setAbsoluteAccuracy(100.0d);
        brentSolver0.resetFunctionValueAccuracy();
        int int6 = brentSolver0.getIterationCount();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount(0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.solve(univariateRealFunction11, 1.0E-14d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 52);
        brentSolver0.setFunctionValueAccuracy((double) (-1));
        brentSolver0.setFunctionValueAccuracy((double) (short) 1);
        int int17 = brentSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.setRelativeAccuracy((double) 10);
        double double10 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0);
        brentSolver0.resetAbsoluteAccuracy();
        double double14 = brentSolver0.getAbsoluteAccuracy();
        double double15 = brentSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass9 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.setRelativeAccuracy((double) 10);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double17 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) -1);
        brentSolver0.setRelativeAccuracy((double) (byte) 0);
        double double22 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 52);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy(97.0d);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.resetRelativeAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int9 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = brentSolver0.getIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) -1);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount(0);
        int int18 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1));
        brentSolver0.resetRelativeAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) (short) -1);
        int int9 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 52);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        int int11 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.resetRelativeAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) 100.0f);
        brentSolver0.setAbsoluteAccuracy((double) 0L);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        brentSolver0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = brentSolver0.solve(univariateRealFunction17, (double) '#', 1.0d, (double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double7 = brentSolver0.getRelativeAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.solve(univariateRealFunction10, (double) 100.0f, (double) (short) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.setRelativeAccuracy((double) 10);
        double double10 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int19 = brentSolver0.getIterationCount();
        int int20 = brentSolver0.getIterationCount();
        double double21 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 'a');
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-15d + "'", double21 == 1.0E-15d);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.setRelativeAccuracy((double) 10);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) ' ');
        brentSolver0.setRelativeAccuracy((double) 100L);
        double double15 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int18 = brentSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = brentSolver0.solve((double) 32, (double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-15d + "'", double15 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.resetRelativeAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int9 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = brentSolver0.getIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 0.0f);
        double double17 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.setRelativeAccuracy((double) 10);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        brentSolver0.setFunctionValueAccuracy((double) '4');
        brentSolver0.setMaximalIterationCount((int) '4');
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) 'a');
        brentSolver0.resetRelativeAccuracy();
        double double21 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 0);
        int int24 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        int int26 = brentSolver0.getIterationCount();
        int int27 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.setRelativeAccuracy((double) 10);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = brentSolver0.getMaximalIterationCount();
        double double16 = brentSolver0.getRelativeAccuracy();
        double double17 = brentSolver0.getFunctionValueAccuracy();
        double double18 = brentSolver0.getAbsoluteAccuracy();
        double double19 = brentSolver0.getAbsoluteAccuracy();
        double double20 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int22 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.setRelativeAccuracy((double) 10);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        double double13 = brentSolver0.getAbsoluteAccuracy();
        double double14 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 10.0f);
        brentSolver0.resetFunctionValueAccuracy();
        double double18 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int20 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 1L);
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        double double10 = brentSolver0.getRelativeAccuracy();
        int int11 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.resetFunctionValueAccuracy();
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int9 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (short) 100);
        double double12 = brentSolver0.getRelativeAccuracy();
        int int13 = brentSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentSolver0.solve((double) 100.0f, (double) 52, (double) 1L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.setRelativeAccuracy((double) 10);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.resetFunctionValueAccuracy();
        double double14 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        double double17 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount(0);
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.setRelativeAccuracy((double) 10);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int14 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (-1));
        brentSolver0.resetMaximalIterationCount();
        int int13 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(0);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double18 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.setRelativeAccuracy((double) 10);
        double double10 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(35.0d);
        brentSolver0.resetMaximalIterationCount();
        int int16 = brentSolver0.getIterationCount();
        double double17 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 10L);
        brentSolver0.resetMaximalIterationCount();
        int int13 = brentSolver0.getMaximalIterationCount();
        double double14 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.setAbsoluteAccuracy(100.0d);
        brentSolver0.setFunctionValueAccuracy((double) (-1));
        brentSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (short) 0);
        brentSolver0.setMaximalIterationCount(0);
        brentSolver0.setRelativeAccuracy((double) (short) 100);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(100.0d);
        double double19 = brentSolver0.getRelativeAccuracy();
        double double20 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-14d + "'", double19 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-14d + "'", double20 == 1.0E-14d);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (-1));
        brentSolver0.resetMaximalIterationCount();
        int int13 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(0);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        java.lang.Class<?> wildcardClass20 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.setRelativeAccuracy((double) 10);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        brentSolver0.setFunctionValueAccuracy((double) '4');
        brentSolver0.setMaximalIterationCount((int) '4');
        double double17 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.setAbsoluteAccuracy(100.0d);
        brentSolver0.setFunctionValueAccuracy((double) (-1));
        brentSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (short) 0);
        brentSolver0.setMaximalIterationCount(0);
        int int14 = brentSolver0.getIterationCount();
        double double15 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(100.0d);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0.0f);
        double double22 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.resetRelativeAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 1.0f);
        int int10 = brentSolver0.getIterationCount();
        double double11 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int13 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setRelativeAccuracy(32.0d);
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int5 = brentSolver0.getIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) -1);
        double double8 = brentSolver0.getFunctionValueAccuracy();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (short) -1);
        brentSolver0.setRelativeAccuracy((double) (-1));
        double double15 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.setAbsoluteAccuracy(100.0d);
        brentSolver0.setFunctionValueAccuracy((double) (-1));
        brentSolver0.setFunctionValueAccuracy((double) 1.0f);
        brentSolver0.setAbsoluteAccuracy((double) 100L);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.setRelativeAccuracy((double) 10);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setRelativeAccuracy((double) 10L);
        int int15 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        int int17 = brentSolver0.getIterationCount();
        int int18 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int5 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) '4');
        brentSolver0.setRelativeAccuracy(1.0E-14d);
        double double10 = brentSolver0.getFunctionValueAccuracy();
        int int11 = brentSolver0.getIterationCount();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int14 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }
}

