package org.apache.commons.math3.optimization.linear;

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
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 97);
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) 'a');
        simplexSolver2.setMaxIterations((-1));
        simplexSolver2.setMaxIterations((int) '4');
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, 0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(97);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass9 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, 97);
        simplexSolver2.setMaxIterations((-1));
        int int5 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = simplexSolver2.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations(1);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = simplexSolver0.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) ' ');
        int int14 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass15 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) (short) 1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int11 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int13 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (short) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '#');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) (byte) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((-1));
        int int6 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(97);
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int14 = simplexSolver2.getMaxIterations();
        int int15 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 97, (int) 'a');
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, 32);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations(1);
        simplexSolver2.setMaxIterations((int) (short) 1);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass9 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (-1));
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(35);
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray8 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList9 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, linearConstraintArray8);
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = simplexSolver2.optimize(linearObjectiveFunction7, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, goalType11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, 35);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 10);
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        java.lang.Class<?> wildcardClass14 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 'a', (int) (short) 1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (short) -1);
        simplexSolver2.setMaxIterations((int) (byte) -1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(97);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) (byte) 100);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) '4');
        int int6 = simplexSolver0.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray6 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList7 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, linearConstraintArray6);
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = simplexSolver2.optimize(linearObjectiveFunction5, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, goalType9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(97);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = simplexSolver2.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int12 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 35);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) 'a');
        simplexSolver2.setMaxIterations((-1));
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, (int) ' ');
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) 'a');
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        java.lang.Class<?> wildcardClass8 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, 1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction14 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray15 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList16 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList16, linearConstraintArray15);
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair20 = simplexSolver2.optimize(linearObjectiveFunction14, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList16, goalType18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray15);
        org.junit.Assert.assertArrayEquals(linearConstraintArray15, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = simplexSolver2.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray6 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList7 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, linearConstraintArray6);
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = simplexSolver2.optimize(linearObjectiveFunction5, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, goalType9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        simplexSolver2.setMaxIterations((int) 'a');
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (-1));
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, (int) (byte) 10);
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = simplexSolver2.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) '#');
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', 0);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int5 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 32);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (-1));
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) (short) 0);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(32);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = simplexSolver2.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (short) 1);
        simplexSolver2.setMaxIterations(0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getIterations();
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getIterations();
        int int12 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), (int) '4');
        simplexSolver2.setMaxIterations((int) '#');
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) (byte) 10);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, (-1));
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray6 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList7 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, linearConstraintArray6);
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = simplexSolver2.optimize(linearObjectiveFunction5, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, goalType9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (int) '4');
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int6 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((-1));
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        int int5 = simplexSolver0.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = simplexSolver0.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (short) 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) 'a');
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction4 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray5 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList6 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, linearConstraintArray5);
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver2.optimize(linearObjectiveFunction4, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, goalType8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray5);
        org.junit.Assert.assertArrayEquals(linearConstraintArray5, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, 32);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations(1);
        simplexSolver2.setMaxIterations((int) (short) 1);
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (int) (short) 1);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray6 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList7 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, linearConstraintArray6);
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = simplexSolver2.optimize(linearObjectiveFunction5, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, goalType9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        simplexSolver2.setMaxIterations((-1));
        int int5 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, 10);
        simplexSolver2.setMaxIterations((int) '#');
        int int5 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int8 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) 'a');
        simplexSolver2.setMaxIterations(35);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, (int) 'a');
        int int3 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        simplexSolver2.setMaxIterations((int) '4');
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (short) 1);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = simplexSolver2.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int14 = simplexSolver0.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 97, (int) (short) 100);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction4 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray5 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList6 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, linearConstraintArray5);
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver2.optimize(linearObjectiveFunction4, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, goalType8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray5);
        org.junit.Assert.assertArrayEquals(linearConstraintArray5, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        simplexSolver2.setMaxIterations((int) '4');
        int int11 = simplexSolver2.getIterations();
        int int12 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction13 = null;
        java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintCollection14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = simplexSolver2.optimize(linearObjectiveFunction13, linearConstraintCollection14, goalType15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(52);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (-1));
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, 0);
        simplexSolver2.setMaxIterations((int) (byte) 10);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) (short) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) '4');
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (int) (short) 1);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getIterations();
        int int12 = simplexSolver2.getIterations();
        int int13 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction14 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray15 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList16 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList16, linearConstraintArray15);
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair20 = simplexSolver2.optimize(linearObjectiveFunction14, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList16, goalType18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray15);
        org.junit.Assert.assertArrayEquals(linearConstraintArray15, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (short) 1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(32);
        int int8 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, 1);
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction4 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray5 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList6 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, linearConstraintArray5);
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver2.optimize(linearObjectiveFunction4, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, goalType8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray5);
        org.junit.Assert.assertArrayEquals(linearConstraintArray5, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (-1));
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray8 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList9 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, linearConstraintArray8);
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = simplexSolver2.optimize(linearObjectiveFunction7, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, goalType11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) (byte) 0);
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, 100);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, 0);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations((int) 'a');
        simplexSolver2.setMaxIterations((int) '4');
        int int16 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) ' ');
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass9 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), 0);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((-1));
        int int10 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        simplexSolver2.setMaxIterations((-1));
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations(32);
        java.lang.Class<?> wildcardClass8 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', 1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', 100);
        simplexSolver2.setMaxIterations((int) '#');
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) '#');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations((-1));
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = simplexSolver2.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 100, 0);
        simplexSolver2.setMaxIterations((-1));
        simplexSolver2.setMaxIterations((int) (short) 100);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations(1);
        int int6 = simplexSolver0.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getMaxIterations();
        int int11 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (int) '#');
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        simplexSolver2.setMaxIterations((int) '#');
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) 'a');
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int7 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass8 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (short) -1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray8 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList9 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, linearConstraintArray8);
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = simplexSolver2.optimize(linearObjectiveFunction7, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, goalType11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) '4');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations(1);
        int int6 = simplexSolver0.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray6 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList7 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, linearConstraintArray6);
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = simplexSolver0.optimize(linearObjectiveFunction5, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, goalType9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) (short) 10);
        simplexSolver2.setMaxIterations((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int4 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) (byte) 10);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction4 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray5 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList6 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, linearConstraintArray5);
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver2.optimize(linearObjectiveFunction4, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, goalType8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray5);
        org.junit.Assert.assertArrayEquals(linearConstraintArray5, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (int) (short) 1);
        simplexSolver2.setMaxIterations(52);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray6 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList7 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, linearConstraintArray6);
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = simplexSolver2.optimize(linearObjectiveFunction5, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, goalType9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (int) (byte) 1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations(1);
        simplexSolver2.setMaxIterations((-1));
        int int13 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(10);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = simplexSolver0.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, 35);
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, (int) (short) 10);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, (int) ' ');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', (int) (short) -1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int7 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = simplexSolver2.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, (int) (short) 10);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) '4');
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 'a', (int) (short) 10);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (byte) 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction16 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray17 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList18 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList18, linearConstraintArray17);
        org.apache.commons.math3.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair22 = simplexSolver2.optimize(linearObjectiveFunction16, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList18, goalType20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray17);
        org.junit.Assert.assertArrayEquals(linearConstraintArray17, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (-1));
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int10 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (int) (short) 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray8 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList9 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, linearConstraintArray8);
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = simplexSolver2.optimize(linearObjectiveFunction7, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, goalType11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations(52);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int10 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getMaxIterations();
        int int11 = simplexSolver0.getIterations();
        java.lang.Class<?> wildcardClass12 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getIterations();
        int int12 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction15 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray16 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList17 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList17, linearConstraintArray16);
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair21 = simplexSolver2.optimize(linearObjectiveFunction15, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList17, goalType19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray16);
        org.junit.Assert.assertArrayEquals(linearConstraintArray16, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        int int16 = simplexSolver2.getIterations();
        int int17 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(32);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction20 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray21 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList22 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList22, linearConstraintArray21);
        org.apache.commons.math3.optimization.GoalType goalType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair26 = simplexSolver2.optimize(linearObjectiveFunction20, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList22, goalType24, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(linearConstraintArray21);
        org.junit.Assert.assertArrayEquals(linearConstraintArray21, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) '#');
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, (int) (byte) -1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((-1));
        int int7 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (int) '4');
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        simplexSolver2.setMaxIterations(35);
        simplexSolver2.setMaxIterations(0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getMaxIterations();
        int int10 = simplexSolver0.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction11 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray12 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList13 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList13, linearConstraintArray12);
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = simplexSolver0.optimize(linearObjectiveFunction11, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList13, goalType15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, 0);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) 1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (short) 1);
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations(32);
        simplexSolver2.setMaxIterations(10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) '4');
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) (byte) 100);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations(35);
        java.lang.Class<?> wildcardClass9 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', (int) (byte) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((-1));
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (byte) -1);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass11 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, 0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(97);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass9 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (short) -1);
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, 35);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) '4');
        simplexSolver2.setMaxIterations(35);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) '4');
        simplexSolver2.setMaxIterations((-1));
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(32);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        simplexSolver2.setMaxIterations((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', (int) '4');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', 97);
        simplexSolver2.setMaxIterations((int) '#');
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', (int) (byte) -1);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = simplexSolver2.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (-1));
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = simplexSolver2.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 1);
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray6 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList7 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, linearConstraintArray6);
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = simplexSolver2.optimize(linearObjectiveFunction5, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, goalType9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        int int16 = simplexSolver2.getIterations();
        int int17 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(32);
        int int20 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction21 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray22 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList23 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList23, linearConstraintArray22);
        org.apache.commons.math3.optimization.GoalType goalType25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair27 = simplexSolver2.optimize(linearObjectiveFunction21, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList23, goalType25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(linearConstraintArray22);
        org.junit.Assert.assertArrayEquals(linearConstraintArray22, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(0);
        int int9 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) '4');
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations(97);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = simplexSolver2.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) 1);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, 97);
        simplexSolver2.setMaxIterations((-1));
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (short) 100);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(97);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = simplexSolver2.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintCollection7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver2.optimize(linearObjectiveFunction6, linearConstraintCollection7, goalType8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 0);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray6 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList7 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, linearConstraintArray6);
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = simplexSolver2.optimize(linearObjectiveFunction5, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, goalType9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, 100);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (-1));
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(35);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) '4');
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = simplexSolver2.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, 10);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) '4');
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) '4');
        simplexSolver2.setMaxIterations((int) (byte) 0);
        simplexSolver2.setMaxIterations(32);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        simplexSolver2.setMaxIterations((int) '4');
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) '#');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass9 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) '#');
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass10 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 52);
        simplexSolver2.setMaxIterations(100);
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getIterations();
        int int12 = simplexSolver2.getIterations();
        int int13 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction4 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray5 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList6 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, linearConstraintArray5);
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver2.optimize(linearObjectiveFunction4, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, goalType8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray5);
        org.junit.Assert.assertArrayEquals(linearConstraintArray5, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) '4');
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, (int) (short) 1);
        int int3 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) '4');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintCollection7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver2.optimize(linearObjectiveFunction6, linearConstraintCollection7, goalType8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = simplexSolver2.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations(1);
        simplexSolver2.setMaxIterations((int) (short) 1);
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = simplexSolver2.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) ' ');
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) '#');
        int int7 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = simplexSolver2.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (-1));
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (-1));
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, (int) (byte) 0);
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (short) -1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray8 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList9 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, linearConstraintArray8);
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = simplexSolver2.optimize(linearObjectiveFunction7, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, goalType11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int11 = simplexSolver2.getIterations();
        int int12 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass13 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 97);
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, 100);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations(100);
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, (int) ' ');
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (byte) -1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (-1));
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintCollection8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = simplexSolver2.optimize(linearObjectiveFunction7, linearConstraintCollection8, goalType9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 35);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = simplexSolver2.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) 0);
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 100);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, (int) (byte) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, 52);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction16 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray17 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList18 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList18, linearConstraintArray17);
        org.apache.commons.math3.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair22 = simplexSolver2.optimize(linearObjectiveFunction16, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList18, goalType20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray17);
        org.junit.Assert.assertArrayEquals(linearConstraintArray17, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray6 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList7 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, linearConstraintArray6);
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = simplexSolver2.optimize(linearObjectiveFunction5, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, goalType9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, 0);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 100);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) 10);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        simplexSolver2.setMaxIterations(97);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) (short) 0);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) (byte) 0);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray8 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList9 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, linearConstraintArray8);
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = simplexSolver2.optimize(linearObjectiveFunction7, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, goalType11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (int) (byte) -1);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) 'a');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        simplexSolver0.setMaxIterations((int) '4');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, (int) '#');
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int7 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass8 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = simplexSolver2.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int10 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction11 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray12 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList13 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList13, linearConstraintArray12);
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = simplexSolver2.optimize(linearObjectiveFunction11, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList13, goalType15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) (byte) 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, 97);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (-1));
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (short) 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (int) '4');
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int16 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(35);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) 'a');
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), (int) '4');
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int9 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass10 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int4 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int10 = simplexSolver0.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (byte) 10);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, 97);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations(32);
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 'a', (int) (short) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations((int) 'a');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(35);
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) (byte) 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', (int) (byte) 100);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getIterations();
        int int14 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), (int) '4');
        simplexSolver2.setMaxIterations((int) '#');
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = simplexSolver2.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) '#');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray8 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList9 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, linearConstraintArray8);
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = simplexSolver2.optimize(linearObjectiveFunction7, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, goalType11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((-1));
        simplexSolver2.setMaxIterations((int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 1);
        int int14 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction15 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray16 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList17 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList17, linearConstraintArray16);
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair21 = simplexSolver2.optimize(linearObjectiveFunction15, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList17, goalType19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray16);
        org.junit.Assert.assertArrayEquals(linearConstraintArray16, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 52);
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int7 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = simplexSolver2.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, 100);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, 1);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), 0);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction4 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray5 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList6 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, linearConstraintArray5);
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver2.optimize(linearObjectiveFunction4, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, goalType8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray5);
        org.junit.Assert.assertArrayEquals(linearConstraintArray5, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) '4');
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) 'a');
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) ' ');
        int int14 = simplexSolver2.getIterations();
        int int15 = simplexSolver2.getMaxIterations();
        int int16 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 52);
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, 35);
        simplexSolver2.setMaxIterations(97);
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (-1));
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(52);
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (short) 100);
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction4 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray5 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList6 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, linearConstraintArray5);
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver2.optimize(linearObjectiveFunction4, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, goalType8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray5);
        org.junit.Assert.assertArrayEquals(linearConstraintArray5, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (-1));
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(35);
        int int6 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int11 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        int int14 = simplexSolver2.getMaxIterations();
        int int15 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int11 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, 1);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        int int8 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) '4');
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) ' ');
        simplexSolver2.setMaxIterations(35);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 'a', (int) (short) 1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', 35);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, 32);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, (int) ' ');
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        simplexSolver2.setMaxIterations((int) '4');
        int int11 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, 97);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, 52);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (byte) 100);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (-1));
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(97);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, (int) '#');
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((-1));
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, 35);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((-1.0d), 100);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), (int) (byte) 1);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) -1);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, 32);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) (short) 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int5 = simplexSolver0.getIterations();
        int int6 = simplexSolver0.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, (int) (byte) 100);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray6 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList7 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, linearConstraintArray6);
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = simplexSolver2.optimize(linearObjectiveFunction5, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, goalType9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = simplexSolver0.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (int) (byte) 10);
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction4 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray5 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList6 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, linearConstraintArray5);
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver2.optimize(linearObjectiveFunction4, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, goalType8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray5);
        org.junit.Assert.assertArrayEquals(linearConstraintArray5, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(32);
        java.lang.Class<?> wildcardClass10 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, 0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 52);
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        simplexSolver2.setMaxIterations((int) 'a');
        int int10 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations(0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((-1));
        int int8 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        java.lang.Class<?> wildcardClass10 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(32);
        int int11 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) (short) -1);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, 35);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) '4');
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        simplexSolver0.setMaxIterations((int) '4');
        simplexSolver0.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '#');
        java.lang.Class<?> wildcardClass11 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations(52);
        int int10 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass11 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) (byte) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(100);
        int int8 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass9 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, (int) ' ');
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) (byte) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations((int) '#');
        int int9 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction10 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray11 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList12 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList12, linearConstraintArray11);
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = simplexSolver2.optimize(linearObjectiveFunction10, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList12, goalType14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction11 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray12 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList13 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList13, linearConstraintArray12);
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = simplexSolver2.optimize(linearObjectiveFunction11, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList13, goalType15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 1);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 100, 52);
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction4 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray5 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList6 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, linearConstraintArray5);
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver2.optimize(linearObjectiveFunction4, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, goalType8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray5);
        org.junit.Assert.assertArrayEquals(linearConstraintArray5, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations((-1));
        simplexSolver0.setMaxIterations(97);
        int int8 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction11 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray12 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList13 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList13, linearConstraintArray12);
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = simplexSolver0.optimize(linearObjectiveFunction11, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList13, goalType15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((-1));
        int int12 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations((-1));
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int7 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, 10);
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction4 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray5 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList6 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, linearConstraintArray5);
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver2.optimize(linearObjectiveFunction4, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, goalType8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray5);
        org.junit.Assert.assertArrayEquals(linearConstraintArray5, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int14 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (byte) 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, (int) '#');
        simplexSolver2.setMaxIterations((int) '#');
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        java.lang.Class<?> wildcardClass11 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) ' ');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (short) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray6 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList7 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, linearConstraintArray6);
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = simplexSolver2.optimize(linearObjectiveFunction5, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList7, goalType9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (short) 100);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 97, 0);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        simplexSolver2.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(10);
        int int7 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, (int) ' ');
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction5 = null;
        java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintCollection6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction5, linearConstraintCollection6, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, 52);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (short) -1);
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) '4');
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = simplexSolver2.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(35);
        int int12 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = simplexSolver2.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction11 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray12 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList13 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList13, linearConstraintArray12);
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = simplexSolver2.optimize(linearObjectiveFunction11, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList13, goalType15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) '4');
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations((int) '#');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (byte) 0);
        simplexSolver2.setMaxIterations((int) ' ');
        int int5 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '#');
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (-1));
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, 97);
        int int3 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int11 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = simplexSolver2.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (byte) 0);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (short) 10);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, 52);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', (int) (byte) 100);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, 52);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, 32);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, (int) (byte) 1);
        simplexSolver2.setMaxIterations((int) '4');
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (int) '4');
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '#');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) '4');
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, 10);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) (short) 10);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) '4');
        simplexSolver2.setMaxIterations(35);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 'a', 10);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) ' ');
        int int12 = simplexSolver0.getMaxIterations();
        java.lang.Class<?> wildcardClass13 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', 1);
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, 1);
        simplexSolver2.setMaxIterations((int) (byte) 1);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) (byte) 100);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, 100);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) 'a');
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
        int int8 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = simplexSolver2.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, 35);
        int int3 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction4 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray5 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList6 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, linearConstraintArray5);
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver2.optimize(linearObjectiveFunction4, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, goalType8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray5);
        org.junit.Assert.assertArrayEquals(linearConstraintArray5, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '#');
        int int11 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = simplexSolver2.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 1);
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray7 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList8 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, linearConstraintArray7);
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = simplexSolver2.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations(1);
        simplexSolver2.setMaxIterations((int) (short) 1);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = simplexSolver2.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), (int) '4');
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int12 = simplexSolver2.getIterations();
        int int13 = simplexSolver2.getIterations();
        int int14 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, (int) '#');
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 10);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray4 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList5 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, linearConstraintArray4);
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.optimize(linearObjectiveFunction3, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList5, goalType7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray4);
        org.junit.Assert.assertArrayEquals(linearConstraintArray4, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, 52);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        int int10 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (short) -1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }
}

