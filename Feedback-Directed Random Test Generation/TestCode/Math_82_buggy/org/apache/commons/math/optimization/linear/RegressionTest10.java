package org.apache.commons.math.optimization.linear;

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
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass9 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1L);
        simplexSolver1.setMaxIterations((int) (short) 1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = simplexSolver1.isOptimal(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        java.lang.Class<?> wildcardClass8 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1L);
        simplexSolver1.setMaxIterations(10);
        double double4 = simplexSolver1.epsilon;
        double double5 = simplexSolver1.epsilon;
        double double6 = simplexSolver1.epsilon;
        java.lang.Class<?> wildcardClass7 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        double double10 = simplexSolver1.epsilon;
        int int11 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass12 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        int int5 = simplexSolver0.getIterations();
        int int6 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) '#');
        simplexSolver1.setMaxIterations((int) '#');
        simplexSolver1.setMaxIterations((int) (byte) 1);
        double double9 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations((int) (byte) -1);
        simplexSolver0.setMaxIterations(10);
        double double7 = simplexSolver0.epsilon;
        int int8 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int11 = simplexSolver0.getMaxIterations();
        int int12 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        double double4 = simplexSolver1.epsilon;
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) 'a');
        int int9 = simplexSolver1.getIterations();
        double double10 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((-1));
        int int7 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass8 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        double double12 = simplexSolver1.epsilon;
        double double13 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(97);
        int int16 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        double double8 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int11 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0E-6d);
        int int2 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getIterations();
        int int6 = simplexSolver0.getIterations();
        double double7 = simplexSolver0.epsilon;
        int int8 = simplexSolver0.getMaxIterations();
        double double9 = simplexSolver0.epsilon;
        int int10 = simplexSolver0.getIterations();
        int int11 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(100);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((-1));
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) -1);
        double double2 = simplexSolver1.epsilon;
        double double3 = simplexSolver1.epsilon;
        double double4 = simplexSolver1.epsilon;
        double double5 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int13 = simplexSolver1.getMaxIterations();
        double double14 = simplexSolver1.epsilon;
        int int15 = simplexSolver1.getIterations();
        int int16 = simplexSolver1.getIterations();
        int int17 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau18 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getIterations();
        int int12 = simplexSolver1.getMaxIterations();
        int int13 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction14 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection15 = null;
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = simplexSolver1.optimize(linearObjectiveFunction14, linearConstraintCollection15, goalType16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        double double2 = simplexSolver1.epsilon;
        double double3 = simplexSolver1.epsilon;
        double double4 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray6 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList7 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList7, linearConstraintArray6);
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver1.optimize(linearObjectiveFunction5, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList7, goalType9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int7 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = simplexSolver1.isOptimal(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int9 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int14 = simplexSolver1.getIterations();
        int int15 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0.0f);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int8 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int12 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass13 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) 'a');
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = simplexSolver1.isOptimal(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1L);
        simplexSolver1.setMaxIterations(10);
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        simplexSolver1.setMaxIterations((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int13 = simplexSolver1.getMaxIterations();
        int int14 = simplexSolver1.getMaxIterations();
        double double15 = simplexSolver1.epsilon;
        int int16 = simplexSolver1.getIterations();
        int int17 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau20 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((-1));
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass10 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        double double2 = simplexSolver0.epsilon;
        double double3 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(32);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver0.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(1);
        int int11 = simplexSolver0.getIterations();
        int int12 = simplexSolver0.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1));
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double7 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        double double2 = simplexSolver1.epsilon;
        double double3 = simplexSolver1.epsilon;
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 1);
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((-1));
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations((int) (byte) -1);
        int int5 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver0.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        simplexSolver1.setMaxIterations(1);
        int int14 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction15 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray16 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList17 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList17, linearConstraintArray16);
        org.apache.commons.math.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = simplexSolver1.optimize(linearObjectiveFunction15, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList17, goalType19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(linearConstraintArray16);
        org.junit.Assert.assertArrayEquals(linearConstraintArray16, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 10);
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = simplexSolver1.isOptimal(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1));
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double6 = simplexSolver1.epsilon;
        double double7 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        double double10 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (byte) 0);
        int int15 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = simplexSolver1.isOptimal(simplexTableau16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) -1);
        int int2 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass3 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getMaxIterations();
        double double11 = simplexSolver1.epsilon;
        double double12 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        double double10 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((-1));
        int int13 = simplexSolver1.getIterations();
        double double14 = simplexSolver1.epsilon;
        double double15 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 100);
        simplexSolver1.setMaxIterations((int) (byte) 0);
        double double20 = simplexSolver1.epsilon;
        int int21 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        double double24 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int8 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) -1);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = simplexSolver0.isOptimal(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(32);
        int int8 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        double double6 = simplexSolver0.epsilon;
        double double7 = simplexSolver0.epsilon;
        double double8 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations(10);
        int int11 = simplexSolver0.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = simplexSolver0.isOptimal(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getIterations();
        int int11 = simplexSolver1.getMaxIterations();
        int int12 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(10);
        simplexSolver1.setMaxIterations(52);
        double double17 = simplexSolver1.epsilon;
        double double18 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        double double2 = simplexSolver1.epsilon;
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass6 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int13 = simplexSolver1.getMaxIterations();
        int int14 = simplexSolver1.getMaxIterations();
        double double15 = simplexSolver1.epsilon;
        int int16 = simplexSolver1.getIterations();
        double double17 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1L));
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        double double4 = simplexSolver1.epsilon;
        java.lang.Class<?> wildcardClass5 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1L));
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        double double4 = simplexSolver1.epsilon;
        double double5 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver1.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        java.lang.Class<?> wildcardClass9 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        double double11 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0E-6d);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(10);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver1.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(32.0d);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 0);
        int int6 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray8 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList9 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList9, linearConstraintArray8);
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.optimize(linearObjectiveFunction7, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList9, goalType11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((-1.0d));
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (byte) 10);
        double double7 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = simplexSolver1.isOptimal(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        double double2 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 1);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) 'a');
        double double11 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = simplexSolver1.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        int int5 = simplexSolver0.getMaxIterations();
        double double6 = simplexSolver0.epsilon;
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(1);
        int int6 = simplexSolver1.getMaxIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = simplexSolver1.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        int int5 = simplexSolver0.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = simplexSolver0.isOptimal(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        double double7 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations((int) 'a');
        int int12 = simplexSolver0.getIterations();
        int int13 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getIterations();
        int int11 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 10);
        int int14 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((-1));
        simplexSolver1.setMaxIterations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = simplexSolver1.isOptimal(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        double double6 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(52);
        int int8 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass8 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass7 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((-1));
        int int7 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((-1));
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations((int) (byte) -1);
        double double5 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations(0);
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getMaxIterations();
        java.lang.Class<?> wildcardClass10 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        double double10 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations((int) (byte) -1);
        simplexSolver0.setMaxIterations(10);
        double double7 = simplexSolver0.epsilon;
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations(32);
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(10);
        java.lang.Class<?> wildcardClass12 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) -1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(10);
        simplexSolver1.setMaxIterations(32);
        double double8 = simplexSolver1.epsilon;
        double double9 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) '#');
        simplexSolver1.setMaxIterations((int) '#');
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) -1);
        double double2 = simplexSolver1.epsilon;
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0E-6d);
        simplexSolver1.setMaxIterations((int) 'a');
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double6 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = simplexSolver1.isOptimal(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(35);
        int int12 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1L));
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getMaxIterations();
        double double7 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 1);
        java.lang.Class<?> wildcardClass10 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        double double11 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int14 = simplexSolver1.getMaxIterations();
        int int15 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) -1);
        int int10 = simplexSolver0.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1L);
        simplexSolver1.setMaxIterations(10);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        java.lang.Class<?> wildcardClass7 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        double double9 = simplexSolver1.epsilon;
        double double10 = simplexSolver1.epsilon;
        double double11 = simplexSolver1.epsilon;
        double double12 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1L);
        simplexSolver1.setMaxIterations((int) (short) 1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = simplexSolver1.isOptimal(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(1);
        double double12 = simplexSolver1.epsilon;
        double double13 = simplexSolver1.epsilon;
        int int14 = simplexSolver1.getMaxIterations();
        int int15 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(10);
        java.lang.Class<?> wildcardClass18 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 10);
        double double4 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        simplexSolver1.setMaxIterations((int) (short) 10);
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations(100);
        double double13 = simplexSolver1.epsilon;
        int int14 = simplexSolver1.getMaxIterations();
        double double15 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction16 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray17 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList18 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList18, linearConstraintArray17);
        org.apache.commons.math.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = simplexSolver1.optimize(linearObjectiveFunction16, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList18, goalType20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray17);
        org.junit.Assert.assertArrayEquals(linearConstraintArray17, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        double double12 = simplexSolver1.epsilon;
        double double13 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int16 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = simplexSolver1.isOptimal(simplexTableau17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getIterations();
        int int6 = simplexSolver0.getIterations();
        double double7 = simplexSolver0.epsilon;
        int int8 = simplexSolver0.getMaxIterations();
        double double9 = simplexSolver0.epsilon;
        int int10 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(10);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((-1));
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 10);
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        double double9 = simplexSolver1.epsilon;
        double double10 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0.0f);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = simplexSolver1.isOptimal(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 0);
        double double10 = simplexSolver1.epsilon;
        int int11 = simplexSolver1.getMaxIterations();
        double double12 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((-1));
        double double7 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (short) 100);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 100);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        double double4 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((-1.0d));
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(97);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver1.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        double double2 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) '4');
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass7 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) 'a');
        double double4 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        double double2 = simplexSolver0.epsilon;
        double double3 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 1);
        simplexSolver0.setMaxIterations((int) (byte) 100);
        simplexSolver0.setMaxIterations((int) '4');
        int int13 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray8 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList9 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList9, linearConstraintArray8);
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.optimize(linearObjectiveFunction7, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList9, goalType11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getMaxIterations();
        double double7 = simplexSolver1.epsilon;
        double double8 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = simplexSolver1.isOptimal(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 100);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        simplexSolver1.setMaxIterations(100);
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        int int11 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = simplexSolver1.isOptimal(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 'a');
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getIterations();
        int int6 = simplexSolver0.getIterations();
        double double7 = simplexSolver0.epsilon;
        int int8 = simplexSolver0.getMaxIterations();
        double double9 = simplexSolver0.epsilon;
        int int10 = simplexSolver0.getIterations();
        int int11 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(100);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = simplexSolver0.isOptimal(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(32.0d);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        double double9 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        double double5 = simplexSolver1.epsilon;
        double double6 = simplexSolver1.epsilon;
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver1.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations(100);
        double double13 = simplexSolver1.epsilon;
        int int14 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int17 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = simplexSolver1.isOptimal(simplexTableau18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) '4');
        int int11 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(97);
        double double14 = simplexSolver1.epsilon;
        int int15 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getIterations();
        int int6 = simplexSolver0.getIterations();
        double double7 = simplexSolver0.epsilon;
        int int8 = simplexSolver0.getMaxIterations();
        double double9 = simplexSolver0.epsilon;
        int int10 = simplexSolver0.getIterations();
        int int11 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(100);
        int int14 = simplexSolver0.getIterations();
        java.lang.Class<?> wildcardClass15 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1));
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver1.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((-1));
        int int10 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0.0f);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = simplexSolver1.isOptimal(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        double double11 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int16 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        simplexSolver1.setMaxIterations(1);
        int int14 = simplexSolver1.getIterations();
        int int15 = simplexSolver1.getIterations();
        double double16 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 0);
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        double double2 = simplexSolver1.epsilon;
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        double double5 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) -1);
        double double2 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) '#');
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        double double7 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        int int5 = simplexSolver0.getMaxIterations();
        double double6 = simplexSolver0.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0E-6d);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.optimize(linearObjectiveFunction5, linearConstraintCollection6, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = simplexSolver1.isOptimal(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getMaxIterations();
        double double8 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (byte) 10);
        simplexSolver0.setMaxIterations(0);
        int int13 = simplexSolver0.getIterations();
        int int14 = simplexSolver0.getIterations();
        int int15 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int10 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = simplexSolver1.isOptimal(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        double double8 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int11 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        double double14 = simplexSolver0.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction15 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray16 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList17 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList17, linearConstraintArray16);
        org.apache.commons.math.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = simplexSolver0.optimize(linearObjectiveFunction15, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList17, goalType19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
        org.junit.Assert.assertNotNull(linearConstraintArray16);
        org.junit.Assert.assertArrayEquals(linearConstraintArray16, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        double double8 = simplexSolver0.epsilon;
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getMaxIterations();
        double double11 = simplexSolver0.epsilon;
        int int12 = simplexSolver0.getIterations();
        int int13 = simplexSolver0.getMaxIterations();
        int int14 = simplexSolver0.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = simplexSolver0.isOptimal(simplexTableau15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        double double2 = simplexSolver0.epsilon;
        double double3 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(32);
        simplexSolver0.setMaxIterations(100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        simplexSolver1.setMaxIterations(100);
        int int4 = simplexSolver1.getMaxIterations();
        double double5 = simplexSolver1.epsilon;
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) 'a');
        simplexSolver1.setMaxIterations((int) (short) 0);
        double double11 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = simplexSolver1.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        double double10 = simplexSolver1.epsilon;
        double double11 = simplexSolver1.epsilon;
        int int12 = simplexSolver1.getMaxIterations();
        double double13 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver1.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) '#');
        simplexSolver1.setMaxIterations((int) '#');
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass10 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1.0f);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        double double2 = simplexSolver0.epsilon;
        double double3 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations((int) 'a');
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int7 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        double double8 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int11 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(52);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = simplexSolver1.isOptimal(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        double double4 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) -1);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0d);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) '#');
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        double double14 = simplexSolver1.epsilon;
        int int15 = simplexSolver1.getMaxIterations();
        double double16 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = simplexSolver1.isOptimal(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver1.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        double double8 = simplexSolver1.epsilon;
        java.lang.Class<?> wildcardClass9 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        java.lang.Class<?> wildcardClass4 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = simplexSolver1.isOptimal(simplexTableau2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double9 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = simplexSolver1.isOptimal(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1);
        double double2 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(35);
        double double12 = simplexSolver1.epsilon;
        double double13 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 10);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        double double7 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int12 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass7 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        double double12 = simplexSolver1.epsilon;
        double double13 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getMaxIterations();
        double double10 = simplexSolver1.epsilon;
        double double11 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(1);
        double double12 = simplexSolver1.epsilon;
        int int13 = simplexSolver1.getIterations();
        int int14 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass9 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) 'a');
        int int5 = simplexSolver1.getMaxIterations();
        double double6 = simplexSolver1.epsilon;
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100);
        double double2 = simplexSolver1.epsilon;
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        double double10 = simplexSolver1.epsilon;
        int int11 = simplexSolver1.getIterations();
        double double12 = simplexSolver1.epsilon;
        int int13 = simplexSolver1.getIterations();
        double double14 = simplexSolver1.epsilon;
        int int15 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction16 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray17 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList18 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList18, linearConstraintArray17);
        org.apache.commons.math.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = simplexSolver1.optimize(linearObjectiveFunction16, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList18, goalType20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray17);
        org.junit.Assert.assertArrayEquals(linearConstraintArray17, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(97);
        simplexSolver1.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((-1));
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = simplexSolver1.isOptimal(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = simplexSolver1.isOptimal(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) -1);
        double double10 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        double double13 = simplexSolver0.epsilon;
        double double14 = simplexSolver0.epsilon;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        double double2 = simplexSolver0.epsilon;
        double double3 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(32);
        double double8 = simplexSolver0.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 1);
        int int6 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray8 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList9 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList9, linearConstraintArray8);
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.optimize(linearObjectiveFunction7, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList9, goalType11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        double double7 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int12 = simplexSolver0.getIterations();
        double double13 = simplexSolver0.epsilon;
        java.lang.Class<?> wildcardClass14 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((-1.0d));
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int5 = simplexSolver1.getMaxIterations();
        double double6 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) '#');
        simplexSolver1.setMaxIterations((int) '#');
        simplexSolver1.setMaxIterations((int) (byte) 1);
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 10);
        double double9 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations(100);
        double double12 = simplexSolver0.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) '4');
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        simplexSolver1.setMaxIterations(97);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = simplexSolver1.isOptimal(simplexTableau15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        double double2 = simplexSolver0.epsilon;
        double double3 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver0.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        simplexSolver1.setMaxIterations((int) (short) 10);
        int int9 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getIterations();
        int int11 = simplexSolver1.getMaxIterations();
        int int12 = simplexSolver1.getMaxIterations();
        int int13 = simplexSolver1.getIterations();
        int int14 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        double double17 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        int int9 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction10 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray11 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList12 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList12, linearConstraintArray11);
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver1.optimize(linearObjectiveFunction10, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList12, goalType14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = simplexSolver1.isOptimal(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) '4');
        int int10 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = simplexSolver1.isOptimal(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0d);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) '#');
        int int10 = simplexSolver1.getMaxIterations();
        double double11 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) '#');
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 100);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getMaxIterations();
        double double7 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getMaxIterations();
        double double11 = simplexSolver1.epsilon;
        int int12 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0d);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) 'a');
        simplexSolver1.setMaxIterations((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1L);
        double double2 = simplexSolver1.epsilon;
        double double3 = simplexSolver1.epsilon;
        double double4 = simplexSolver1.epsilon;
        double double5 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = simplexSolver1.isOptimal(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) '#');
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getMaxIterations();
        double double10 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getIterations();
        double double11 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray8 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList9 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList9, linearConstraintArray8);
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.optimize(linearObjectiveFunction7, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList9, goalType11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(35);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(1);
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass11 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) 'a');
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        simplexSolver1.setMaxIterations(100);
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        int int11 = simplexSolver1.getMaxIterations();
        double double12 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getMaxIterations();
        int int12 = simplexSolver1.getMaxIterations();
        int int13 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction14 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray15 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList16 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList16, linearConstraintArray15);
        org.apache.commons.math.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = simplexSolver1.optimize(linearObjectiveFunction14, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList16, goalType18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray15);
        org.junit.Assert.assertArrayEquals(linearConstraintArray15, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        double double10 = simplexSolver1.epsilon;
        double double11 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 10);
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1);
        double double2 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        int int5 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = simplexSolver1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        double double10 = simplexSolver1.epsilon;
        double double11 = simplexSolver1.epsilon;
        int int12 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction13 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray14 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList15 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList15, linearConstraintArray14);
        org.apache.commons.math.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = simplexSolver1.optimize(linearObjectiveFunction13, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList15, goalType17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray14);
        org.junit.Assert.assertArrayEquals(linearConstraintArray14, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) 'a');
        int int12 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        int int5 = simplexSolver0.getIterations();
        int int6 = simplexSolver0.getIterations();
        double double7 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations(52);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        double double2 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 100);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        double double4 = simplexSolver1.epsilon;
        double double5 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        double double6 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = simplexSolver1.isOptimal(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) 'a');
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(10);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        double double9 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = simplexSolver1.isOptimal(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        double double7 = simplexSolver0.epsilon;
        double double8 = simplexSolver0.epsilon;
        int int9 = simplexSolver0.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0d);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((-1));
        simplexSolver1.setMaxIterations((int) '#');
        int int14 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '#');
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction2 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray3 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList4 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList4, linearConstraintArray3);
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.optimize(linearObjectiveFunction2, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList4, goalType6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray3);
        org.junit.Assert.assertArrayEquals(linearConstraintArray3, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(97);
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction10 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray11 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList12 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList12, linearConstraintArray11);
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver1.optimize(linearObjectiveFunction10, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList12, goalType14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1L);
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations((int) ' ');
        simplexSolver1.setMaxIterations((int) (short) -1);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((-1));
        simplexSolver1.setMaxIterations(0);
        int int12 = simplexSolver1.getMaxIterations();
        int int13 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = simplexSolver1.isOptimal(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(10);
        double double7 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        double double10 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((-1));
        int int13 = simplexSolver1.getIterations();
        double double14 = simplexSolver1.epsilon;
        double double15 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 100);
        double double18 = simplexSolver1.epsilon;
        int int19 = simplexSolver1.getMaxIterations();
        int int20 = simplexSolver1.getMaxIterations();
        double double21 = simplexSolver1.epsilon;
        int int22 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction23 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray24 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList25 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList25, linearConstraintArray24);
        org.apache.commons.math.optimization.GoalType goalType27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair29 = simplexSolver1.optimize(linearObjectiveFunction23, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList25, goalType27, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray24);
        org.junit.Assert.assertArrayEquals(linearConstraintArray24, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getIterations();
        int int6 = simplexSolver0.getIterations();
        double double7 = simplexSolver0.epsilon;
        double double8 = simplexSolver0.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = simplexSolver0.isOptimal(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getIterations();
        double double12 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction13 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray14 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList15 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList15, linearConstraintArray14);
        org.apache.commons.math.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = simplexSolver1.optimize(linearObjectiveFunction13, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList15, goalType17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray14);
        org.junit.Assert.assertArrayEquals(linearConstraintArray14, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getMaxIterations();
        double double11 = simplexSolver1.epsilon;
        double double12 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(1);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = simplexSolver1.isOptimal(simplexTableau15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((-1));
        int int7 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        double double3 = simplexSolver0.epsilon;
        double double4 = simplexSolver0.epsilon;
        int int5 = simplexSolver0.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(32);
        java.lang.Class<?> wildcardClass12 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        int int2 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = simplexSolver1.isOptimal(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getMaxIterations();
        int int12 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass13 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1L);
        simplexSolver1.setMaxIterations(10);
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) 'a');
        int int5 = simplexSolver1.getMaxIterations();
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver1.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = simplexSolver1.isOptimal(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        double double11 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(52);
        simplexSolver1.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 10);
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass10 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        double double5 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        double double6 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction10 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray11 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList12 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList12, linearConstraintArray11);
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver1.optimize(linearObjectiveFunction10, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList12, goalType14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) 'a');
        int int6 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 10);
        double double7 = simplexSolver1.epsilon;
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(35);
        int int11 = simplexSolver1.getMaxIterations();
        int int12 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        double double5 = simplexSolver1.epsilon;
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) ' ');
        simplexSolver1.setMaxIterations(32);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction11 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray12 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList13 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList13, linearConstraintArray12);
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = simplexSolver1.optimize(linearObjectiveFunction11, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList13, goalType15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = simplexSolver1.isOptimal(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 0);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = simplexSolver1.isOptimal(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        double double12 = simplexSolver1.epsilon;
        double double13 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(97);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int18 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0.0f);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        double double5 = simplexSolver1.epsilon;
        double double6 = simplexSolver1.epsilon;
        double double7 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        double double12 = simplexSolver1.epsilon;
        double double13 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int16 = simplexSolver1.getIterations();
        int int17 = simplexSolver1.getMaxIterations();
        double double18 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau19 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 10);
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 1);
        int int12 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) 'a');
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int10 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction11 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray12 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList13 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList13, linearConstraintArray12);
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = simplexSolver1.optimize(linearObjectiveFunction11, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList13, goalType15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(1);
        double double12 = simplexSolver1.epsilon;
        double double13 = simplexSolver1.epsilon;
        int int14 = simplexSolver1.getMaxIterations();
        int int15 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(10);
        int int18 = simplexSolver1.getIterations();
        int int19 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int9 = simplexSolver1.getMaxIterations();
        double double10 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = simplexSolver1.isOptimal(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(1);
        int int9 = simplexSolver1.getMaxIterations();
        double double10 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction11 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray12 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList13 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList13, linearConstraintArray12);
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = simplexSolver1.optimize(linearObjectiveFunction11, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList13, goalType15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        double double10 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass8 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) 'a');
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations((int) 'a');
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(35);
        int int9 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 10);
        double double14 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction15 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray16 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList17 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList17, linearConstraintArray16);
        org.apache.commons.math.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = simplexSolver1.optimize(linearObjectiveFunction15, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList17, goalType19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray16);
        org.junit.Assert.assertArrayEquals(linearConstraintArray16, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        double double2 = simplexSolver0.epsilon;
        double double3 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 1);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations(32);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = simplexSolver1.isOptimal(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int10 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = simplexSolver1.isOptimal(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((-1));
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction13 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray14 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList15 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList15, linearConstraintArray14);
        org.apache.commons.math.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = simplexSolver1.optimize(linearObjectiveFunction13, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList15, goalType17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray14);
        org.junit.Assert.assertArrayEquals(linearConstraintArray14, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver1.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(35);
        double double12 = simplexSolver1.epsilon;
        int int13 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int16 = simplexSolver1.getMaxIterations();
        double double17 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getMaxIterations();
        double double7 = simplexSolver1.epsilon;
        double double8 = simplexSolver1.epsilon;
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = simplexSolver1.isOptimal(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        int int5 = simplexSolver0.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        int int11 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass12 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) 'a');
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations((int) (short) 100);
        double double12 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1.0f);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) 'a');
        int int5 = simplexSolver1.getMaxIterations();
        double double6 = simplexSolver1.epsilon;
        double double7 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 0);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = simplexSolver1.isOptimal(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((-1));
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver0.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        double double5 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver1.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0.0f);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) 'a');
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        double double8 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(32);
        int int7 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations((int) 'a');
        simplexSolver1.setMaxIterations(100);
        int int8 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = simplexSolver1.isOptimal(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) 'a');
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = simplexSolver1.isOptimal(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) ' ');
        double double14 = simplexSolver1.epsilon;
        int int15 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (short) 10);
        int int14 = simplexSolver1.getIterations();
        int int15 = simplexSolver1.getMaxIterations();
        double double16 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations((int) (byte) -1);
        double double5 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations(0);
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getMaxIterations();
        int int10 = simplexSolver0.getMaxIterations();
        int int11 = simplexSolver0.getMaxIterations();
        double double12 = simplexSolver0.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction13 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray14 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList15 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList15, linearConstraintArray14);
        org.apache.commons.math.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = simplexSolver0.optimize(linearObjectiveFunction13, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList15, goalType17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
        org.junit.Assert.assertNotNull(linearConstraintArray14);
        org.junit.Assert.assertArrayEquals(linearConstraintArray14, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 100);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(32);
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        double double6 = simplexSolver0.epsilon;
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(1);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations(35);
        double double10 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        double double8 = simplexSolver0.epsilon;
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getIterations();
        java.lang.Class<?> wildcardClass8 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        double double9 = simplexSolver1.epsilon;
        double double10 = simplexSolver1.epsilon;
        int int11 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass12 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        simplexSolver1.setMaxIterations((int) ' ');
        double double4 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(52);
        java.lang.Class<?> wildcardClass7 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        double double2 = simplexSolver1.epsilon;
        double double3 = simplexSolver1.epsilon;
        java.lang.Class<?> wildcardClass4 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass10 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass6 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        simplexSolver1.setMaxIterations(100);
        int int4 = simplexSolver1.getMaxIterations();
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        int int5 = simplexSolver0.getMaxIterations();
        double double6 = simplexSolver0.epsilon;
        double double7 = simplexSolver0.epsilon;
        int int8 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100);
        double double2 = simplexSolver1.epsilon;
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        int int7 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = simplexSolver1.isOptimal(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(10);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = simplexSolver1.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1L);
        simplexSolver1.setMaxIterations((int) (short) 10);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        double double2 = simplexSolver1.epsilon;
        double double3 = simplexSolver1.epsilon;
        double double4 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(1);
        simplexSolver1.setMaxIterations(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        double double10 = simplexSolver1.epsilon;
        int int11 = simplexSolver1.getIterations();
        double double12 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction13 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray14 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList15 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList15, linearConstraintArray14);
        org.apache.commons.math.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = simplexSolver1.optimize(linearObjectiveFunction13, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList15, goalType17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray14);
        org.junit.Assert.assertArrayEquals(linearConstraintArray14, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 100);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((-1));
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 0);
        double double7 = simplexSolver1.epsilon;
        double double8 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) -1);
        double double11 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = simplexSolver1.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(35);
        double double12 = simplexSolver1.epsilon;
        int int13 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int16 = simplexSolver1.getMaxIterations();
        int int17 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        double double10 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((-1));
        int int13 = simplexSolver1.getIterations();
        double double14 = simplexSolver1.epsilon;
        double double15 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int18 = simplexSolver1.getIterations();
        int int19 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        double double7 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((-1));
        double double6 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        double double5 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = simplexSolver1.isOptimal(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((-1));
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = simplexSolver1.isOptimal(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        double double10 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((-1));
        int int13 = simplexSolver1.getIterations();
        double double14 = simplexSolver1.epsilon;
        double double15 = simplexSolver1.epsilon;
        int int16 = simplexSolver1.getMaxIterations();
        double double17 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(100);
        java.lang.Class<?> wildcardClass9 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int14 = simplexSolver1.getIterations();
        double double15 = simplexSolver1.epsilon;
        double double16 = simplexSolver1.epsilon;
        int int17 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        double double10 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((-1));
        int int13 = simplexSolver1.getIterations();
        double double14 = simplexSolver1.epsilon;
        double double15 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 100);
        simplexSolver1.setMaxIterations((int) (byte) 0);
        double double20 = simplexSolver1.epsilon;
        int int21 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int24 = simplexSolver1.getIterations();
        double double25 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver1.getMaxIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver1.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0E-6d);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) -1);
        int int10 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int13 = simplexSolver0.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int13 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction14 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray15 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList16 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList16, linearConstraintArray15);
        org.apache.commons.math.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = simplexSolver1.optimize(linearObjectiveFunction14, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList16, goalType18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(linearConstraintArray15);
        org.junit.Assert.assertArrayEquals(linearConstraintArray15, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1);
        double double2 = simplexSolver1.epsilon;
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(97);
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((-1));
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) ' ');
        double double9 = simplexSolver0.epsilon;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getMaxIterations();
        double double11 = simplexSolver1.epsilon;
        double double12 = simplexSolver1.epsilon;
        int int13 = simplexSolver1.getMaxIterations();
        int int14 = simplexSolver1.getMaxIterations();
        int int15 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = simplexSolver1.isOptimal(simplexTableau16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((-1.0d));
        int int2 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(35);
        int int12 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) 'a');
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        double double10 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        double double11 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = simplexSolver1.isOptimal(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        double double10 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int13 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 32);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau2 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = simplexSolver1.isOptimal(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 1);
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((-1));
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getIterations();
        int int11 = simplexSolver1.getMaxIterations();
        double double12 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 'a');
        int int2 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = simplexSolver1.isOptimal(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) '4');
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        double double11 = simplexSolver1.epsilon;
        java.lang.Class<?> wildcardClass12 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 100);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        simplexSolver1.setMaxIterations((int) 'a');
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getIterations();
        double double10 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 0);
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = simplexSolver1.isOptimal(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = simplexSolver1.isOptimal(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1L));
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        double double4 = simplexSolver1.epsilon;
        double double5 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 100);
        double double8 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((-1));
        simplexSolver1.setMaxIterations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        double double4 = simplexSolver0.epsilon;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) -1);
        double double2 = simplexSolver1.epsilon;
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray6 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList7 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList7, linearConstraintArray6);
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver1.optimize(linearObjectiveFunction5, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList7, goalType9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0.0f);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        double double5 = simplexSolver1.epsilon;
        double double6 = simplexSolver1.epsilon;
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass9 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getIterations();
        int int11 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 10);
        double double14 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 1);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = simplexSolver1.isOptimal(simplexTableau17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        double double7 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(1);
        int int10 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction11 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray12 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList13 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList13, linearConstraintArray12);
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = simplexSolver1.optimize(linearObjectiveFunction11, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList13, goalType15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int13 = simplexSolver1.getMaxIterations();
        int int14 = simplexSolver1.getMaxIterations();
        double double15 = simplexSolver1.epsilon;
        double double16 = simplexSolver1.epsilon;
        double double17 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(97);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray6 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList7 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList7, linearConstraintArray6);
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver1.optimize(linearObjectiveFunction5, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList7, goalType9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction11 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray12 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList13 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList13, linearConstraintArray12);
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = simplexSolver1.optimize(linearObjectiveFunction11, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList13, goalType15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(10);
        simplexSolver1.setMaxIterations(35);
        java.lang.Class<?> wildcardClass8 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(100.0d);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        double double5 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(32);
        simplexSolver1.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(10);
        double double6 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        double double2 = simplexSolver1.epsilon;
        java.lang.Class<?> wildcardClass3 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        double double2 = simplexSolver0.epsilon;
        double double3 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int6 = simplexSolver0.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        double double8 = simplexSolver0.epsilon;
        int int9 = simplexSolver0.getIterations();
        double double10 = simplexSolver0.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction11 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray12 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList13 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList13, linearConstraintArray12);
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = simplexSolver0.optimize(linearObjectiveFunction11, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList13, goalType15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getMaxIterations();
        double double11 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = simplexSolver1.isOptimal(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        double double7 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction11 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray12 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList13 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList13, linearConstraintArray12);
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = simplexSolver1.optimize(linearObjectiveFunction11, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList13, goalType15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getMaxIterations();
        int int12 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = simplexSolver1.isOptimal(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((-1));
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) ' ');
        int int9 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int12 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        double double12 = simplexSolver1.epsilon;
        double double13 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int16 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(97);
        double double19 = simplexSolver1.epsilon;
        double double20 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 0);
        simplexSolver1.setMaxIterations((int) (short) 1);
        int int15 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getIterations();
        int int11 = simplexSolver1.getMaxIterations();
        int int12 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(10);
        int int15 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int18 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau19 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((-1));
        double double6 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int9 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        double double11 = simplexSolver1.epsilon;
        int int12 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = simplexSolver1.isOptimal(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1L));
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) '4');
        simplexSolver1.setMaxIterations((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        double double8 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int11 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(35);
        double double14 = simplexSolver0.epsilon;
        int int15 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        int int5 = simplexSolver0.getMaxIterations();
        double double6 = simplexSolver0.epsilon;
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getIterations();
        double double10 = simplexSolver1.epsilon;
        int int11 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        double double14 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = simplexSolver1.isOptimal(simplexTableau15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        int int5 = simplexSolver0.getIterations();
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0.0f);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        double double5 = simplexSolver1.epsilon;
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(97);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(32.0d);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 0);
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = simplexSolver1.isOptimal(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        double double5 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        simplexSolver1.setMaxIterations(100);
        int int4 = simplexSolver1.getMaxIterations();
        double double5 = simplexSolver1.epsilon;
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) 'a');
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getMaxIterations();
        int int12 = simplexSolver1.getMaxIterations();
        int int13 = simplexSolver1.getIterations();
        int int14 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction15 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray16 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList17 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList17, linearConstraintArray16);
        org.apache.commons.math.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = simplexSolver1.optimize(linearObjectiveFunction15, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList17, goalType19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(linearConstraintArray16);
        org.junit.Assert.assertArrayEquals(linearConstraintArray16, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(1);
        double double12 = simplexSolver1.epsilon;
        double double13 = simplexSolver1.epsilon;
        int int14 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) 'a');
        simplexSolver1.setMaxIterations((int) (short) 1);
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getMaxIterations();
        double double11 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(100.0d);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        double double4 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray6 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList7 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList7, linearConstraintArray6);
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver1.optimize(linearObjectiveFunction5, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList7, goalType9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0.0f);
        int int2 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        double double2 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = simplexSolver1.isOptimal(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations(52);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 100);
        simplexSolver1.setMaxIterations(100);
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 0);
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) ' ');
        int int12 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(32);
        simplexSolver1.setMaxIterations((int) ' ');
        int int14 = simplexSolver1.getIterations();
        int int15 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction16 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray17 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList18 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList18, linearConstraintArray17);
        org.apache.commons.math.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = simplexSolver1.optimize(linearObjectiveFunction16, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList18, goalType20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray17);
        org.junit.Assert.assertArrayEquals(linearConstraintArray17, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations((int) (byte) -1);
        double double5 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations(0);
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getMaxIterations();
        int int10 = simplexSolver0.getMaxIterations();
        int int11 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction14 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection15 = null;
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = simplexSolver0.optimize(linearObjectiveFunction14, linearConstraintCollection15, goalType16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getIterations();
        int int6 = simplexSolver0.getIterations();
        double double7 = simplexSolver0.epsilon;
        int int8 = simplexSolver0.getMaxIterations();
        double double9 = simplexSolver0.epsilon;
        int int10 = simplexSolver0.getIterations();
        int int11 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(100);
        int int14 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction17 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray18 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList19 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList19, linearConstraintArray18);
        org.apache.commons.math.optimization.GoalType goalType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = simplexSolver0.optimize(linearObjectiveFunction17, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList19, goalType21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray18);
        org.junit.Assert.assertArrayEquals(linearConstraintArray18, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) '#');
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        double double5 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver1.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(35);
        int int7 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = simplexSolver1.isOptimal(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        double double8 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 10);
        double double11 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        simplexSolver1.setMaxIterations(100);
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(0);
        int int12 = simplexSolver1.getIterations();
        int int13 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction14 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray15 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList16 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList16, linearConstraintArray15);
        org.apache.commons.math.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = simplexSolver1.optimize(linearObjectiveFunction14, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList16, goalType18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray15);
        org.junit.Assert.assertArrayEquals(linearConstraintArray15, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        double double8 = simplexSolver0.epsilon;
        int int9 = simplexSolver0.getIterations();
        double double10 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int13 = simplexSolver0.getIterations();
        int int14 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        double double2 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) 'a');
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(1);
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int9 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int12 = simplexSolver1.getMaxIterations();
        int int13 = simplexSolver1.getIterations();
        int int14 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(97);
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getIterations();
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 0);
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        double double11 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = simplexSolver1.isOptimal(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) -1);
        double double2 = simplexSolver1.epsilon;
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double6 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        double double10 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int13 = simplexSolver1.getIterations();
        double double14 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(1);
        double double12 = simplexSolver1.epsilon;
        double double13 = simplexSolver1.epsilon;
        int int14 = simplexSolver1.getMaxIterations();
        int int15 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getIterations();
        double double5 = simplexSolver1.epsilon;
        double double6 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        double double2 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) '4');
        simplexSolver1.setMaxIterations(0);
        double double7 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) '#');
        double double10 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass11 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        simplexSolver1.setMaxIterations(100);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getMaxIterations();
        java.lang.Class<?> wildcardClass11 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getMaxIterations();
        double double11 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getIterations();
        int int11 = simplexSolver1.getMaxIterations();
        int int12 = simplexSolver1.getMaxIterations();
        int int13 = simplexSolver1.getIterations();
        double double14 = simplexSolver1.epsilon;
        int int15 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((-1));
        java.lang.Class<?> wildcardClass18 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getMaxIterations();
        int int12 = simplexSolver1.getMaxIterations();
        int int13 = simplexSolver1.getMaxIterations();
        int int14 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = simplexSolver1.isOptimal(simplexTableau15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (byte) 0);
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 100);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = simplexSolver1.isOptimal(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        double double7 = simplexSolver0.epsilon;
        double double8 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((-1));
        simplexSolver0.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) -1);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau2 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        double double10 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((-1));
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int15 = simplexSolver1.getIterations();
        int int16 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0E-6d);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        double double9 = simplexSolver1.epsilon;
        double double10 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = simplexSolver1.isOptimal(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getMaxIterations();
        double double11 = simplexSolver1.epsilon;
        int int12 = simplexSolver1.getMaxIterations();
        int int13 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        double double5 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray8 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList9 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList9, linearConstraintArray8);
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.optimize(linearObjectiveFunction7, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList9, goalType11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1));
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) -1);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(1);
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(35);
        int int10 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        int int12 = simplexSolver1.getIterations();
        java.lang.Class<?> wildcardClass13 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0E-6d);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) -1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(10);
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0E-6d);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = simplexSolver1.isOptimal(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 0);
        double double7 = simplexSolver1.epsilon;
        double double8 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) -1);
        double double11 = simplexSolver1.epsilon;
        double double12 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        double double4 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(1);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations(100);
        double double13 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(0);
        int int16 = simplexSolver1.getIterations();
        double double17 = simplexSolver1.epsilon;
        int int18 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau19 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1);
        double double2 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        int int5 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1L));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        double double7 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 10);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = simplexSolver1.isOptimal(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        int int5 = simplexSolver0.getIterations();
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 0);
        simplexSolver1.setMaxIterations((-1));
        double double11 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getIterations();
        double double11 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (byte) 0);
        int int6 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100);
        double double2 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) ' ');
        double double5 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 10);
        simplexSolver1.setMaxIterations(32);
        int int10 = simplexSolver1.getIterations();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        double double4 = simplexSolver1.epsilon;
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) 'a');
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        double double10 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(35);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        int int8 = simplexSolver0.getMaxIterations();
        java.lang.Class<?> wildcardClass9 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = simplexSolver1.isOptimal(simplexTableau2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = simplexSolver1.isOptimal(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 100);
        int int2 = simplexSolver1.getIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        double double9 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        double double6 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(100);
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(35);
        double double14 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        simplexSolver1.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        double double9 = simplexSolver1.epsilon;
        int int10 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations(0);
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        double double8 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) '#');
        int int11 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10);
        double double2 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getMaxIterations();
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver1.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(1);
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        simplexSolver1.setMaxIterations(0);
        int int4 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = simplexSolver1.isOptimal(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1L));
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        double double8 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10.0f);
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }
}

