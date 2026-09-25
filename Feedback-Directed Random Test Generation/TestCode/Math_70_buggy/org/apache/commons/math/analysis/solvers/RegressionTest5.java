package org.apache.commons.math.analysis.solvers;

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
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        int int16 = bisectionSolver0.getMaximalIterationCount();
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        int int18 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 0);
        bisectionSolver0.setMaximalIterationCount(0);
        int int14 = bisectionSolver0.getIterationCount();
        double double15 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        java.lang.Class<?> wildcardClass14 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int6 = bisectionSolver0.getMaximalIterationCount();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.setRelativeAccuracy(1.0E-14d);
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int17 = bisectionSolver0.getIterationCount();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.solve((double) 100, (double) (short) 100, 52.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 52);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int14 = bisectionSolver0.getIterationCount();
        int int15 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double16 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-14d + "'", double16 == 1.0E-14d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        double double4 = bisectionSolver0.getFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(10);
        double double11 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 52);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 10.0f);
        bisectionSolver0.resetRelativeAccuracy();
        int int12 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        bisectionSolver0.setFunctionValueAccuracy((double) 1L);
        bisectionSolver0.resetMaximalIterationCount();
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
        bisectionSolver0.setMaximalIterationCount(52);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        int int7 = bisectionSolver0.getIterationCount();
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        int int9 = bisectionSolver0.getIterationCount();
        int int10 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(1.0d);
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        int int18 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double21 = bisectionSolver0.getRelativeAccuracy();
        int int22 = bisectionSolver0.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction23 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double27 = bisectionSolver0.solve(univariateRealFunction23, (double) 10, 1.0d, (double) 35);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 10.0f);
        bisectionSolver0.setRelativeAccuracy((double) (short) 1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction23 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double26 = bisectionSolver0.solve(univariateRealFunction23, (double) (byte) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.setAbsoluteAccuracy(1.0d);
        double double24 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass26 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double18 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-15d + "'", double18 == 1.0E-15d);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        bisectionSolver0.setRelativeAccuracy((double) 1.0f);
        double double17 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        java.lang.Class<?> wildcardClass16 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bisectionSolver0.solve((double) 10.0f, 1.0E-15d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        double double15 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 100);
        double double18 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double20 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) ' ');
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(0);
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bisectionSolver0.solve(univariateRealFunction19, (double) (short) 100, (double) (byte) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 1);
        double double11 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(10);
        bisectionSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.solve(univariateRealFunction15, (-1.0d), 52.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) ' ');
        int int11 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        double double15 = bisectionSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.solve((double) (byte) 100, (double) (short) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double20 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-15d + "'", double20 == 1.0E-15d);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.solve((double) 35, (double) 0, (double) '4');
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
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        int int13 = bisectionSolver0.getMaximalIterationCount();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy(1.0E-14d);
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 1.0f);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve(univariateRealFunction11, (double) 0L, (double) 'a', (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 0);
        bisectionSolver0.setMaximalIterationCount(0);
        int int14 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        double double19 = bisectionSolver0.getFunctionValueAccuracy();
        double double20 = bisectionSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = bisectionSolver0.solve((double) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-15d + "'", double19 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-15d + "'", double20 == 1.0E-15d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1.0f));
        double double17 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.solve((double) 10, (double) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 0);
        bisectionSolver0.resetMaximalIterationCount();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double26 = bisectionSolver0.solve(univariateRealFunction22, (double) (short) -1, (double) 97, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) ' ');
        bisectionSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.solve((double) 1, (double) 1L, (double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        int int13 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(32.0d);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        double double18 = bisectionSolver0.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass19 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve(52.0d, (double) 1L, (double) 97);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 97);
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy(10.0d);
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double21 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 'a');
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        bisectionSolver0.setRelativeAccuracy((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-14d + "'", double21 == 1.0E-14d);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int16 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int18 = bisectionSolver0.getIterationCount();
        int int19 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int8 = bisectionSolver0.getIterationCount();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.solve(univariateRealFunction11, 0.0d, (double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 52);
        double double14 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        double double17 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(52.0d);
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((-1.0d));
        int int12 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount(52);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setAbsoluteAccuracy((double) 0);
        bisectionSolver0.resetMaximalIterationCount();
        double double16 = bisectionSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.solve((double) 1, 1.0E-14d, 52.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        int int13 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy(1.0E-14d);
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        int int20 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setRelativeAccuracy((double) (-1.0f));
        bisectionSolver0.resetAbsoluteAccuracy();
        double double9 = bisectionSolver0.getRelativeAccuracy();
        double double10 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.solve(univariateRealFunction17, (double) (byte) 1, (double) (byte) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1));
        int int12 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        double double17 = bisectionSolver0.getRelativeAccuracy();
        int int18 = bisectionSolver0.getIterationCount();
        double double19 = bisectionSolver0.getAbsoluteAccuracy();
        double double20 = bisectionSolver0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass21 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-6d + "'", double16 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-6d + "'", double19 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy(1.0E-6d);
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.resetRelativeAccuracy();
        java.lang.Class<?> wildcardClass21 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        int int7 = bisectionSolver0.getIterationCount();
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        int int9 = bisectionSolver0.getIterationCount();
        int int10 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) 52);
        int int17 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = bisectionSolver0.solve(univariateRealFunction20, (double) 0.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bisectionSolver0.solve(univariateRealFunction17, (double) 97, (double) 97, (double) 0.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1));
        bisectionSolver0.setRelativeAccuracy(52.0d);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double16 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-15d + "'", double16 == 1.0E-15d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        double double17 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0E-14d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double23 = bisectionSolver0.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass24 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0E-15d + "'", double23 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) ' ');
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) -1);
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.setFunctionValueAccuracy((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 0);
        bisectionSolver0.setMaximalIterationCount(0);
        int int14 = bisectionSolver0.getIterationCount();
        double double15 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) 1L);
        bisectionSolver0.setMaximalIterationCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double13 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(10.0d);
        bisectionSolver0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.solve(univariateRealFunction17, (double) 35, (double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        int int13 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        java.lang.Class<?> wildcardClass15 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int17 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve(35.0d, (double) (short) 0, (double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double9 = bisectionSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        int int17 = bisectionSolver0.getIterationCount();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        double double19 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0E-15d);
        double double21 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double23 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) '4');
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0E-14d + "'", double23 == 1.0E-14d);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bisectionSolver0.solve((double) 10, (double) (-1), (double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 52);
        bisectionSolver0.resetRelativeAccuracy();
        java.lang.Class<?> wildcardClass17 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-6d + "'", double16 == 1.0E-6d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 100);
        double double20 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) ' ');
        bisectionSolver0.setAbsoluteAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy(1.0E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double17 = bisectionSolver0.getRelativeAccuracy();
        int int18 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double20 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.setAbsoluteAccuracy(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 0);
        bisectionSolver0.setMaximalIterationCount(0);
        int int14 = bisectionSolver0.getIterationCount();
        double double15 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(100.0d);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double23 = bisectionSolver0.getAbsoluteAccuracy();
        double double24 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0E-14d + "'", double24 == 1.0E-14d);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1));
        int int12 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int7 = bisectionSolver0.getIterationCount();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) '4');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        double double17 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double19 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 97);
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-6d + "'", double17 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-6d + "'", double19 == 1.0E-6d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        int int13 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (short) 1);
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.solve((double) 100L, 0.0d, (double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        bisectionSolver0.setFunctionValueAccuracy((double) ' ');
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount(1);
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(1.0E-6d);
        bisectionSolver0.resetFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass20 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass12 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 1);
        double double11 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int19 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.solve(univariateRealFunction10, 10.0d, (double) (-1));
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
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(32.0d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve(univariateRealFunction13, 35.0d, (double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetRelativeAccuracy();
        double double21 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 97);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.solve((double) '4', 35.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        double double19 = bisectionSolver0.getRelativeAccuracy();
        double double20 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 0);
        bisectionSolver0.setMaximalIterationCount(0);
        int int14 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double16 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-15d + "'", double16 == 1.0E-15d);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double18 = bisectionSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bisectionSolver0.solve((double) 52, (double) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double23 = bisectionSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction24 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double27 = bisectionSolver0.solve(univariateRealFunction24, (double) 97, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.solve(32.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1.0f));
        double double17 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        int int15 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve((double) (short) 10, (double) (-1), (double) 97);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getRelativeAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy(1.0E-14d);
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) ' ');
        bisectionSolver0.setAbsoluteAccuracy((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setAbsoluteAccuracy((double) (-1L));
        bisectionSolver0.resetRelativeAccuracy();
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve(univariateRealFunction13, (double) (-1), 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(10);
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 10.0f);
        int int19 = bisectionSolver0.getIterationCount();
        double double20 = bisectionSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = bisectionSolver0.solve(univariateRealFunction21, (double) ' ', 1.0E-15d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        bisectionSolver0.setFunctionValueAccuracy((double) ' ');
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        double double17 = bisectionSolver0.getRelativeAccuracy();
        int int18 = bisectionSolver0.getIterationCount();
        double double19 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-6d + "'", double16 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-6d + "'", double19 == 1.0E-6d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        int int15 = bisectionSolver0.getMaximalIterationCount();
        int int16 = bisectionSolver0.getIterationCount();
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.solve(97.0d, (double) 97);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double18 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        double double15 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        bisectionSolver0.setFunctionValueAccuracy((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        int int17 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double15 = bisectionSolver0.getRelativeAccuracy();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-14d + "'", double16 == 1.0E-14d);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double17 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) ' ');
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double15 = bisectionSolver0.getRelativeAccuracy();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-6d + "'", double16 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-15d + "'", double17 == 1.0E-15d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double18 = bisectionSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(0);
        int int18 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double20 = bisectionSolver0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bisectionSolver0.solve(univariateRealFunction21, (double) 32, 1.0E-14d, (double) ' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-14d + "'", double20 == 1.0E-14d);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        double double13 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.solve(univariateRealFunction14, (double) (short) 1, (double) 0.0f, 1.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) -1);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        double double17 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0E-14d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double23 = bisectionSolver0.getFunctionValueAccuracy();
        double double24 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0E-15d + "'", double23 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int12 = bisectionSolver0.getMaximalIterationCount();
        double double13 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.solve((double) (short) 100, 1.0E-6d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        int int17 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double21 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        // The following exception was thrown during execution in test generation
        try {
            double double24 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-14d + "'", double21 == 1.0E-14d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 100.0f);
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 10);
        double double20 = bisectionSolver0.getAbsoluteAccuracy();
        int int21 = bisectionSolver0.getIterationCount();
        java.lang.Class<?> wildcardClass22 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        double double19 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10L);
        int int22 = bisectionSolver0.getMaximalIterationCount();
        double double23 = bisectionSolver0.getFunctionValueAccuracy();
        double double24 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int8 = bisectionSolver0.getIterationCount();
        double double9 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bisectionSolver0.solve(univariateRealFunction6, (double) (-1L), (double) (-1L), (double) 35);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.solve((double) (-1L), (double) (short) -1, 1.0E-6d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        int int13 = bisectionSolver0.getIterationCount();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = bisectionSolver0.solve(univariateRealFunction20, 97.0d, (double) 52, (double) 10.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        double double4 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bisectionSolver0.solve(univariateRealFunction7, (double) 10.0f, 1.0E-15d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setMaximalIterationCount(0);
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        int int18 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        int int21 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double23 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double17 = bisectionSolver0.getRelativeAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(0);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy(1.0E-14d);
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(100.0d);
        bisectionSolver0.setMaximalIterationCount((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(0);
        int int18 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double17 = bisectionSolver0.getRelativeAccuracy();
        int int18 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double20 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int24 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double21 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 'a');
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        bisectionSolver0.setRelativeAccuracy((double) (byte) 0);
        int int30 = bisectionSolver0.getMaximalIterationCount();
        double double31 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-14d + "'", double21 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0E-15d + "'", double31 == 1.0E-15d);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int16 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int18 = bisectionSolver0.getIterationCount();
        double double19 = bisectionSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        int int14 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int16 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1));
        bisectionSolver0.setRelativeAccuracy(52.0d);
        bisectionSolver0.resetMaximalIterationCount();
        double double15 = bisectionSolver0.getRelativeAccuracy();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double13 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.solve(35.0d, (double) 10L);
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
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy((double) (short) 100);
        bisectionSolver0.resetAbsoluteAccuracy();
        int int14 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 10);
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 100);
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int17 = bisectionSolver0.getIterationCount();
        double double18 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double20 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) ' ');
        double double6 = bisectionSolver0.getRelativeAccuracy();
        int int7 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double16 = bisectionSolver0.getFunctionValueAccuracy();
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) ' ');
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bisectionSolver0.solve(univariateRealFunction18, (double) 'a', (double) 100L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) ' ');
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        double double17 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0E-14d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (-1.0f));
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction23 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double27 = bisectionSolver0.solve(univariateRealFunction23, 1.0d, (double) (-1L), (double) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 1L);
        double double6 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        int int10 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        int int18 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        int int21 = bisectionSolver0.getIterationCount();
        double double22 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 52);
        double double14 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 100);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-6d);
        int int19 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 1);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        int int13 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        double double19 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount(1);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        int int24 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        double double4 = bisectionSolver0.getFunctionValueAccuracy();
        double double5 = bisectionSolver0.getRelativeAccuracy();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) ' ');
        bisectionSolver0.resetRelativeAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double17 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double20 = bisectionSolver0.getRelativeAccuracy();
        double double21 = bisectionSolver0.getRelativeAccuracy();
        double double22 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-14d + "'", double20 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-14d + "'", double21 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve(0.0d, (double) 52, 52.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
        int int19 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int13 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        bisectionSolver0.setRelativeAccuracy((double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int17 = bisectionSolver0.getIterationCount();
        double double18 = bisectionSolver0.getFunctionValueAccuracy();
        double double19 = bisectionSolver0.getFunctionValueAccuracy();
        double double20 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.setAbsoluteAccuracy((double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.solve(univariateRealFunction11, (double) 0.0f, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int15 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) -1);
        bisectionSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 1);
        bisectionSolver0.setRelativeAccuracy(0.0d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve(univariateRealFunction11, (double) (byte) -1, 35.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.solve(univariateRealFunction16, 0.0d, (double) 'a', (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        int int15 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '4');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 0);
        bisectionSolver0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve(univariateRealFunction12, (double) 52, (double) 0L, (double) 35);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0.0f);
        int int14 = bisectionSolver0.getIterationCount();
        double double15 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(1.0d);
        bisectionSolver0.setRelativeAccuracy((-1.0d));
        int int19 = bisectionSolver0.getIterationCount();
        int int20 = bisectionSolver0.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bisectionSolver0.solve(univariateRealFunction21, (double) '4', (double) 100, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double9 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 0);
        java.lang.Class<?> wildcardClass10 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        int int16 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(1.0E-15d);
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.resetMaximalIterationCount();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass12 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 0);
        bisectionSolver0.setMaximalIterationCount(0);
        int int14 = bisectionSolver0.getIterationCount();
        double double15 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(100.0d);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0.0f);
        bisectionSolver0.resetAbsoluteAccuracy();
        int int23 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 52);
        double double14 = bisectionSolver0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass15 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        bisectionSolver0.setRelativeAccuracy((double) (byte) 1);
        double double15 = bisectionSolver0.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass16 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-15d + "'", double15 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.solve(univariateRealFunction8, (double) '#', (double) 10L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) ' ');
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        bisectionSolver0.setAbsoluteAccuracy((double) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) 1L);
        double double16 = bisectionSolver0.getRelativeAccuracy();
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass18 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-14d + "'", double16 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.solve(0.0d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1));
        bisectionSolver0.setRelativeAccuracy(52.0d);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 1);
        double double11 = bisectionSolver0.getRelativeAccuracy();
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass9 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int13 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        bisectionSolver0.setFunctionValueAccuracy((double) 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 100.0f);
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 10);
        int int20 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bisectionSolver0.solve((double) 100, (double) 97);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0);
        bisectionSolver0.setMaximalIterationCount(10);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 52);
        java.lang.Class<?> wildcardClass18 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double15 = bisectionSolver0.getRelativeAccuracy();
        int int16 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        java.lang.Class<?> wildcardClass19 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 0);
        bisectionSolver0.setMaximalIterationCount(0);
        bisectionSolver0.setRelativeAccuracy((double) (short) 100);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(100.0d);
        double double19 = bisectionSolver0.getRelativeAccuracy();
        double double20 = bisectionSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = bisectionSolver0.solve(univariateRealFunction21, (double) 100, (double) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-14d + "'", double19 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double13 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        bisectionSolver0.setRelativeAccuracy((double) (byte) 1);
        int int15 = bisectionSolver0.getIterationCount();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass17 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        int int13 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(32.0d);
        bisectionSolver0.setRelativeAccuracy((double) 1);
        double double18 = bisectionSolver0.getFunctionValueAccuracy();
        double double19 = bisectionSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int12 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 100);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 97);
        double double18 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(1.0d);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double18 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = bisectionSolver0.solve((double) 10.0f, (double) (short) -1, (double) 35);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double17 = bisectionSolver0.getRelativeAccuracy();
        int int18 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy(10.0d);
        double double21 = bisectionSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bisectionSolver0.solve((double) 35, (double) (short) 0, (double) (short) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        double double19 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 10);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount(10);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int17 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy(1.0E-6d);
        int int20 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        bisectionSolver0.resetRelativeAccuracy();
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.solve(univariateRealFunction14, (double) (short) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double13 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        int int14 = bisectionSolver0.getIterationCount();
        double double15 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 100);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        int int7 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(32.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 52);
        double double14 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 100);
        bisectionSolver0.resetRelativeAccuracy();
        double double18 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-14d + "'", double18 == 1.0E-14d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int12 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (short) 1);
        int int15 = bisectionSolver0.getIterationCount();
        int int16 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        double double4 = bisectionSolver0.getFunctionValueAccuracy();
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 52);
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.solve((double) (short) 1, (double) 1, (double) (byte) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        int int7 = bisectionSolver0.getIterationCount();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '4');
        bisectionSolver0.resetAbsoluteAccuracy();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 100);
        bisectionSolver0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass16 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double18 = bisectionSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bisectionSolver0.solve((double) (short) 0, (-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-15d + "'", double18 == 1.0E-15d);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1));
        int int12 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.solve(univariateRealFunction16, (double) (byte) 0, 1.0E-6d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int17 = bisectionSolver0.getIterationCount();
        double double18 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        double double17 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double19 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 97);
        double double23 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int25 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double29 = bisectionSolver0.solve(97.0d, 52.0d, (double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-6d + "'", double17 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-6d + "'", double19 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 0);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double17 = bisectionSolver0.getRelativeAccuracy();
        int int18 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double20 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(35.0d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction23 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double27 = bisectionSolver0.solve(univariateRealFunction23, (double) (byte) -1, (double) 35, 1.0E-14d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) 0.0f);
        java.lang.Class<?> wildcardClass20 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0E-15d);
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 10);
        double double6 = bisectionSolver0.getRelativeAccuracy();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        java.lang.Class<?> wildcardClass8 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        double double17 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0E-14d);
        bisectionSolver0.setRelativeAccuracy((double) 52);
        bisectionSolver0.setMaximalIterationCount((int) (short) 10);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 0);
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) ' ');
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) -1);
        bisectionSolver0.setMaximalIterationCount(52);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) ' ');
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 0);
        bisectionSolver0.setMaximalIterationCount(0);
        bisectionSolver0.setRelativeAccuracy((double) (short) 100);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 10);
        double double19 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 52);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 10);
        double double15 = bisectionSolver0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.solve(univariateRealFunction16, (double) (short) 1, (double) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        java.lang.Class<?> wildcardClass6 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bisectionSolver0.solve(univariateRealFunction19, 0.0d, (double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) ' ');
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int12 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 10.0f);
        int int18 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 97);
        bisectionSolver0.setRelativeAccuracy((double) 100);
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 0);
        bisectionSolver0.setAbsoluteAccuracy(32.0d);
        double double19 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 1);
        bisectionSolver0.setAbsoluteAccuracy(52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-15d + "'", double19 == 1.0E-15d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        bisectionSolver0.resetMaximalIterationCount();
        double double16 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int18 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 100);
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double16 = bisectionSolver0.getFunctionValueAccuracy();
        int int17 = bisectionSolver0.getMaximalIterationCount();
        int int18 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = bisectionSolver0.getIterationCount();
        double double13 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10L);
        double double16 = bisectionSolver0.getFunctionValueAccuracy();
        int int17 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        int int19 = bisectionSolver0.getMaximalIterationCount();
        int int20 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 0.0f);
        int int17 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bisectionSolver0.solve(100.0d, (-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int16 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int18 = bisectionSolver0.getIterationCount();
        int int19 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        bisectionSolver0.resetMaximalIterationCount();
        int int18 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) -1);
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 10);
        int int14 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy(1.0E-14d);
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int14 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (-1.0f));
        bisectionSolver0.setMaximalIterationCount(1);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        int int15 = bisectionSolver0.getMaximalIterationCount();
        int int16 = bisectionSolver0.getIterationCount();
        int int17 = bisectionSolver0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bisectionSolver0.solve(univariateRealFunction18, (double) 0.0f, (double) (-1.0f), 32.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        int int15 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (-1.0f));
        int int18 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy(1.0E-15d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bisectionSolver0.solve(univariateRealFunction21, (double) 10, (double) 52, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(52.0d);
        double double18 = bisectionSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 52);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double15 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        double double19 = bisectionSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-15d + "'", double15 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-15d + "'", double19 == 1.0E-15d);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        int int18 = bisectionSolver0.getIterationCount();
        int int19 = bisectionSolver0.getMaximalIterationCount();
        double double20 = bisectionSolver0.getAbsoluteAccuracy();
        double double21 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        double double12 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 0);
        double double15 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setRelativeAccuracy((double) (-1.0f));
        int int8 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        int int16 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '#');
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 10);
        bisectionSolver0.setAbsoluteAccuracy(97.0d);
        java.lang.Class<?> wildcardClass17 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        double double15 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int17 = bisectionSolver0.getIterationCount();
        double double18 = bisectionSolver0.getFunctionValueAccuracy();
        double double19 = bisectionSolver0.getFunctionValueAccuracy();
        double double20 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.setAbsoluteAccuracy((double) (-1.0f));
        double double25 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy((double) (short) 100);
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double15 = bisectionSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.solve((double) ' ', (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        int int17 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double21 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-14d + "'", double21 == 1.0E-14d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.solve((double) (byte) 100, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 10.0f);
        bisectionSolver0.setFunctionValueAccuracy((double) 32);
        java.lang.Class<?> wildcardClass19 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        double double13 = bisectionSolver0.getRelativeAccuracy();
        int int14 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) ' ');
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        int int24 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getRelativeAccuracy();
        int int12 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 10.0f);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double22 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 52);
        java.lang.Class<?> wildcardClass25 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-6d + "'", double22 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double17 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int19 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double21 = bisectionSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1));
        bisectionSolver0.resetMaximalIterationCount();
        int int13 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.solve(univariateRealFunction16, (double) 10, 1.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        double double13 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.solve((double) (-1.0f), (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.resetMaximalIterationCount();
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double16 = bisectionSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-15d + "'", double16 == 1.0E-15d);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(1.0E-15d);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 0L);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 100);
        java.lang.Class<?> wildcardClass16 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.resetRelativeAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 10);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve(univariateRealFunction11, 0.0d, (double) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 100);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '4');
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.solve(univariateRealFunction8, (double) (-1), 1.0E-14d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        int int13 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double17 = bisectionSolver0.getRelativeAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bisectionSolver0.solve(univariateRealFunction21, (double) '#', (double) 0L, (double) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) ' ');
        bisectionSolver0.setRelativeAccuracy(32.0d);
        bisectionSolver0.setMaximalIterationCount(52);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 0);
        int int12 = bisectionSolver0.getMaximalIterationCount();
        double double13 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.solve(univariateRealFunction8, 1.0E-14d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        int int10 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (-1));
        double double13 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(52.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve((double) 32, (double) 10L, (double) 10L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.resetMaximalIterationCount();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1));
        bisectionSolver0.resetMaximalIterationCount();
        int int13 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(0);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double16 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double13 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(10.0d);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) ' ');
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 32);
        bisectionSolver0.setMaximalIterationCount(1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        double double17 = bisectionSolver0.getRelativeAccuracy();
        int int18 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-6d + "'", double16 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        int int14 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int16 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double12 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 35);
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bisectionSolver0.solve((double) (short) 100, 10.0d, (double) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        int int7 = bisectionSolver0.getIterationCount();
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bisectionSolver0.solve(univariateRealFunction5, (double) ' ', (double) 0, (double) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) ' ');
        int int6 = bisectionSolver0.getIterationCount();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount(100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int12 = bisectionSolver0.getMaximalIterationCount();
        double double13 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve(univariateRealFunction13, (double) 52, (double) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        int int15 = bisectionSolver0.getMaximalIterationCount();
        java.lang.Class<?> wildcardClass16 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int17 = bisectionSolver0.getMaximalIterationCount();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double20 = bisectionSolver0.getRelativeAccuracy();
        double double21 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-14d + "'", double20 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setAbsoluteAccuracy((double) 0);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) -1);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int14 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        java.lang.Class<?> wildcardClass16 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 10.0f);
        bisectionSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bisectionSolver0.solve(univariateRealFunction22, 35.0d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int8 = bisectionSolver0.getIterationCount();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int14 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy(1.0E-14d);
        bisectionSolver0.setMaximalIterationCount(97);
        bisectionSolver0.setRelativeAccuracy((double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.solve(32.0d, 0.0d, 97.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double15 = bisectionSolver0.getRelativeAccuracy();
        int int16 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.solve((double) 100.0f, (double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass13 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setMaximalIterationCount(10);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double17 = bisectionSolver0.getAbsoluteAccuracy();
        int int18 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        int int7 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 1);
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(1.0E-15d);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        double double17 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-6d + "'", double17 == 1.0E-6d);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bisectionSolver0.solve(0.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0E-15d);
        int int13 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy(1.0E-14d);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 0);
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        int int18 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        bisectionSolver0.setAbsoluteAccuracy((double) 1);
        bisectionSolver0.setRelativeAccuracy(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 100.0f);
        int int18 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        int int14 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        double double19 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        bisectionSolver0.setFunctionValueAccuracy((double) ' ');
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount(1);
        double double18 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-14d + "'", double18 == 1.0E-14d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int17 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy(1.0E-6d);
        int int20 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int22 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((-1));
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bisectionSolver0.solve((double) 1.0f, (double) 35, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 10.0f);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double22 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 52);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction25 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double29 = bisectionSolver0.solve(univariateRealFunction25, (double) (short) 10, 35.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-6d + "'", double22 == 1.0E-6d);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy(1.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) 10.0f);
        bisectionSolver0.resetAbsoluteAccuracy();
        int int19 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.resetMaximalIterationCount();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        int int17 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '4');
        int int8 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int17 = bisectionSolver0.getMaximalIterationCount();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double21 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-15d + "'", double21 == 1.0E-15d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        bisectionSolver0.resetMaximalIterationCount();
        int int7 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        bisectionSolver0.setFunctionValueAccuracy((double) 0L);
        bisectionSolver0.setFunctionValueAccuracy(100.0d);
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bisectionSolver0.solve((double) 52, (double) (short) -1, (double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 100);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.solve(univariateRealFunction10, (double) (byte) 1, (double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double15 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.solve((double) 35, 35.0d, (double) ' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        double double17 = bisectionSolver0.getRelativeAccuracy();
        double double18 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-14d + "'", double17 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-14d + "'", double18 == 1.0E-14d);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 100);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        double double19 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount(1);
        double double22 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 100);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 97);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int17 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double19 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double26 = bisectionSolver0.solve(univariateRealFunction22, (double) 1, (double) 1.0f, (double) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (short) 100);
        double double12 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1.0f));
        bisectionSolver0.resetFunctionValueAccuracy();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        double double13 = bisectionSolver0.getRelativeAccuracy();
        int int14 = bisectionSolver0.getMaximalIterationCount();
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 100);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 97);
        int int5 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        int int18 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int21 = bisectionSolver0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bisectionSolver0.solve(univariateRealFunction22, (double) (byte) 0, (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0E-15d);
        bisectionSolver0.resetRelativeAccuracy();
        int int22 = bisectionSolver0.getMaximalIterationCount();
        double double23 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 1);
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.setMaximalIterationCount(100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        double double6 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        double double4 = bisectionSolver0.getFunctionValueAccuracy();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        double double6 = bisectionSolver0.getRelativeAccuracy();
        int int7 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double17 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int19 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double21 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(35.0d);
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) ' ');
        bisectionSolver0.setRelativeAccuracy(32.0d);
        bisectionSolver0.setMaximalIterationCount(52);
        bisectionSolver0.setAbsoluteAccuracy((double) (short) -1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve(univariateRealFunction12, 0.0d, 0.0d, 1.0E-14d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.solve((double) '4', (double) (short) -1, (double) ' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double20 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int22 = bisectionSolver0.getMaximalIterationCount();
        int int23 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-15d + "'", double20 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        double double19 = bisectionSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = bisectionSolver0.solve(univariateRealFunction20, 0.0d, 32.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(0);
        bisectionSolver0.setRelativeAccuracy((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double9 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int19 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        bisectionSolver0.setAbsoluteAccuracy((double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 52);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.setAbsoluteAccuracy((double) 1L);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction24 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double27 = bisectionSolver0.solve(univariateRealFunction24, 100.0d, 32.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int17 = bisectionSolver0.getMaximalIterationCount();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double20 = bisectionSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-14d + "'", double20 == 1.0E-14d);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 52);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(52);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(0);
        int int18 = bisectionSolver0.getMaximalIterationCount();
        int int19 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bisectionSolver0.solve((double) (-1.0f), (double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        double double16 = bisectionSolver0.getFunctionValueAccuracy();
        double double17 = bisectionSolver0.getRelativeAccuracy();
        double double18 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-14d + "'", double17 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-14d + "'", double18 == 1.0E-14d);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy((double) (short) 100);
        bisectionSolver0.resetAbsoluteAccuracy();
        int int14 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 100);
        java.lang.Class<?> wildcardClass15 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        int int13 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        int int17 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-6d + "'", double16 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 100.0f);
        java.lang.Class<?> wildcardClass18 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(1.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.solve(univariateRealFunction9, (double) '4', 1.0E-15d, (double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bisectionSolver0.solve(univariateRealFunction6, (double) 52, (double) 52);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double17 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bisectionSolver0.solve(univariateRealFunction19, (double) (short) 10, 35.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 10.0f);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.solve(univariateRealFunction14, (double) 0, (double) 'a', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double20 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-15d + "'", double20 == 1.0E-15d);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        bisectionSolver0.setRelativeAccuracy((double) (byte) 1);
        double double15 = bisectionSolver0.getFunctionValueAccuracy();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-15d + "'", double15 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(10);
        int int14 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) '#');
        bisectionSolver0.setMaximalIterationCount(97);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bisectionSolver0.solve(univariateRealFunction19, (double) 32, (double) 1.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount(10);
        int int20 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        int int15 = bisectionSolver0.getMaximalIterationCount();
        int int16 = bisectionSolver0.getIterationCount();
        int int17 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(52.0d);
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 52);
        double double13 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int15 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 0.0f);
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double20 = bisectionSolver0.getFunctionValueAccuracy();
        double double21 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-14d + "'", double21 == 1.0E-14d);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setAbsoluteAccuracy((double) 32);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.solve(0.0d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 0);
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 10);
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        double double15 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        double double18 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double17 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy(32.0d);
        double double22 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve((double) (short) -1, (double) (-1L), (double) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double17 = bisectionSolver0.getRelativeAccuracy();
        int int18 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setRelativeAccuracy((double) 0.0f);
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int19 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0E-14d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 10.0f);
        bisectionSolver0.resetRelativeAccuracy();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        int int12 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 52);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double15 = bisectionSolver0.getFunctionValueAccuracy();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        int int17 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bisectionSolver0.solve(1.0E-14d, 10.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-15d + "'", double15 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double21 = bisectionSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-14d + "'", double21 == 1.0E-14d);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        double double17 = bisectionSolver0.getRelativeAccuracy();
        int int18 = bisectionSolver0.getIterationCount();
        double double19 = bisectionSolver0.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass20 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-6d + "'", double16 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-6d + "'", double19 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bisectionSolver0.solve(0.0d, (double) 0L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy(100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double13 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        double double4 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double13 = bisectionSolver0.getFunctionValueAccuracy();
        int int14 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        double double15 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double17 = bisectionSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bisectionSolver0.solve(univariateRealFunction18, (double) (short) 0, (double) (-1.0f), 1.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double6 = bisectionSolver0.getRelativeAccuracy();
        int int7 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double5 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.solve((double) (short) 100, (double) (short) 1, (double) (byte) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        int int15 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double21 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 'a');
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        bisectionSolver0.setRelativeAccuracy((double) (byte) 0);
        int int30 = bisectionSolver0.getMaximalIterationCount();
        double double31 = bisectionSolver0.getFunctionValueAccuracy();
        int int32 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-14d + "'", double21 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0E-15d + "'", double31 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 52);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy(1.0E-14d);
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) ' ');
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        double double15 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        double double21 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-6d + "'", double21 == 1.0E-6d);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        int int18 = bisectionSolver0.getIterationCount();
        int int19 = bisectionSolver0.getMaximalIterationCount();
        double double20 = bisectionSolver0.getAbsoluteAccuracy();
        double double21 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double26 = bisectionSolver0.solve((double) (-1.0f), 100.0d, 1.0E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int19 = bisectionSolver0.getIterationCount();
        int int20 = bisectionSolver0.getIterationCount();
        double double21 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-15d + "'", double21 == 1.0E-15d);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 52);
        double double9 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy(1.0E-6d);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) ' ');
        double double21 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.resetFunctionValueAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double17 = bisectionSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-14d + "'", double17 == 1.0E-14d);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setAbsoluteAccuracy((double) (-1L));
        bisectionSolver0.resetMaximalIterationCount();
        int int12 = bisectionSolver0.getIterationCount();
        int int13 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int13 = bisectionSolver0.getMaximalIterationCount();
        int int14 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double21 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 'a');
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double29 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        int int32 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-14d + "'", double21 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 97.0d + "'", double29 == 97.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetRelativeAccuracy();
        double double21 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 0);
        int int24 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) ' ');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass15 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setMaximalIterationCount((int) '4');
        double double17 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double20 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double22 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-15d + "'", double20 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-15d + "'", double22 == 1.0E-15d);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 52);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double15 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) '#');
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-15d + "'", double15 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        int int13 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.solve(univariateRealFunction15, 1.0E-6d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int17 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) ' ');
        bisectionSolver0.setRelativeAccuracy((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1));
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) -1);
        bisectionSolver0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass19 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        bisectionSolver0.setAbsoluteAccuracy((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        bisectionSolver0.resetMaximalIterationCount();
        int int7 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        int int10 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1.0f));
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        int int15 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy(1.0E-6d);
        double double18 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-6d + "'", double18 == 1.0E-6d);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.setFunctionValueAccuracy(1.0d);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 52);
        bisectionSolver0.setMaximalIterationCount(0);
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.solve((double) (short) -1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        double double11 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 10L);
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        java.lang.Class<?> wildcardClass16 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        double double17 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double19 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 97);
        bisectionSolver0.resetMaximalIterationCount();
        double double24 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-6d + "'", double17 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-6d + "'", double19 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0E-15d + "'", double24 == 1.0E-15d);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.resetMaximalIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve(univariateRealFunction12, (double) 52, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getAbsoluteAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) ' ');
        double double6 = bisectionSolver0.getRelativeAccuracy();
        int int7 = bisectionSolver0.getIterationCount();
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        int int7 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 97);
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 100);
        double double14 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        int int13 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 52);
        double double14 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 100);
        bisectionSolver0.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 100);
        bisectionSolver0.setMaximalIterationCount(97);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        double double17 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double19 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 97);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy(100.0d);
        bisectionSolver0.setAbsoluteAccuracy(35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-6d + "'", double17 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-6d + "'", double19 == 1.0E-6d);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setMaximalIterationCount((int) (short) 0);
        bisectionSolver0.setRelativeAccuracy((double) (byte) 0);
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setRelativeAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) -1);
        double double15 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double17 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 52);
        bisectionSolver0.resetRelativeAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) -1);
        int int15 = bisectionSolver0.getMaximalIterationCount();
        java.lang.Class<?> wildcardClass16 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve((double) '#', (double) 0, (double) '4');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 0);
        bisectionSolver0.setMaximalIterationCount(0);
        bisectionSolver0.setRelativeAccuracy((double) (short) 100);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 100);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(1.0E-14d);
        int int28 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setAbsoluteAccuracy((double) (-1L));
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 100);
        bisectionSolver0.setFunctionValueAccuracy((double) 100L);
        bisectionSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.solve(univariateRealFunction17, (double) 1, (double) (short) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int7 = bisectionSolver0.getIterationCount();
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setAbsoluteAccuracy((double) (-1L));
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 100);
        bisectionSolver0.setFunctionValueAccuracy((double) 100L);
        java.lang.Class<?> wildcardClass16 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int14 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 1);
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-15d + "'", double14 == 1.0E-15d);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) '4');
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double19 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        int int22 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-15d + "'", double19 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        int int14 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int16 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        double double6 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }
}

