package org.apache.commons.math3.optimization.linear;

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
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) ' ');
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int11 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, 1);
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
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), 35);
        int int3 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
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
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) (byte) 10);
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
            org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = simplexSolver2.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, true);
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
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) ' ');
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
        int int10 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(32);
        int int13 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (short) 0);
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
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int13 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        java.lang.Class<?> wildcardClass16 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        simplexSolver2.setMaxIterations((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(linearConstraintArray17);
        org.junit.Assert.assertArrayEquals(linearConstraintArray17, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) ' ');
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (short) 10);
        java.lang.Class<?> wildcardClass16 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 35);
        simplexSolver2.setMaxIterations(0);
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
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (byte) -1);
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int9 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(32);
        simplexSolver0.setMaxIterations(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, 0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(97);
        int int7 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, 35);
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
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 1);
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(97);
        java.lang.Class<?> wildcardClass10 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        simplexSolver2.setMaxIterations((-1));
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations(1);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) (byte) 100);
        simplexSolver2.setMaxIterations(10);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((-1));
        simplexSolver2.setMaxIterations((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray16);
        org.junit.Assert.assertArrayEquals(linearConstraintArray16, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, (int) (short) 0);
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
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        simplexSolver2.setMaxIterations(35);
        int int16 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass17 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((-1));
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int11 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass11 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, 10);
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
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) (short) -1);
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, (int) '4');
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, (int) (byte) 10);
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
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, 32);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', 100);
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) '#');
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
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations(100);
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction10 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray11 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList12 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList12, linearConstraintArray11);
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = simplexSolver2.optimize(linearObjectiveFunction10, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList12, goalType14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, 100);
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
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
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
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(10);
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintCollection13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = simplexSolver2.optimize(linearObjectiveFunction12, linearConstraintCollection13, goalType14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        int int11 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', (int) (short) -1);
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
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(97);
        simplexSolver0.setMaxIterations((int) (byte) -1);
        simplexSolver0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction16 = null;
        java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintCollection17 = null;
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair20 = simplexSolver0.optimize(linearObjectiveFunction16, linearConstraintCollection17, goalType18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, 32);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (int) (short) 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        int int7 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
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
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 10);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
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
        simplexSolver2.setMaxIterations((int) '#');
        int int18 = simplexSolver2.getMaxIterations();
        int int19 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau20 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) '#');
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
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
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 100);
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
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations((-1));
        simplexSolver0.setMaxIterations(97);
        int int8 = simplexSolver0.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (-1));
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(35);
        simplexSolver2.setMaxIterations((int) (byte) -1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) 'a');
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), 32);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, (-1));
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) '4');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) 'a');
        simplexSolver2.setMaxIterations((-1));
        simplexSolver2.setMaxIterations(52);
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
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 100, (int) (short) -1);
        simplexSolver2.setMaxIterations(97);
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
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int4 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int10 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((-1));
        simplexSolver0.setMaxIterations((int) (byte) -1);
        int int15 = simplexSolver0.getMaxIterations();
        int int16 = simplexSolver0.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction17 = null;
        java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintCollection18 = null;
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair21 = simplexSolver0.optimize(linearObjectiveFunction17, linearConstraintCollection18, goalType19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction4 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray5 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList6 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, linearConstraintArray5);
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver0.optimize(linearObjectiveFunction4, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList6, goalType8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray5);
        org.junit.Assert.assertArrayEquals(linearConstraintArray5, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) '4');
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(1);
        java.lang.Class<?> wildcardClass13 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) 0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) (short) 10);
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
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        simplexSolver2.setMaxIterations((int) 'a');
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintCollection9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = simplexSolver2.optimize(linearObjectiveFunction8, linearConstraintCollection9, goalType10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) '4');
        simplexSolver0.setMaxIterations((int) '4');
        simplexSolver0.setMaxIterations((int) (byte) -1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations(10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, (-1));
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (-1));
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 100);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (-1));
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, (int) (short) 0);
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
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
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
        int int18 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass19 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) ' ');
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, 97);
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
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (byte) 100);
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations(35);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((-1));
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int13 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass14 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, (int) '#');
        simplexSolver2.setMaxIterations((int) '#');
        int int5 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
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
        simplexSolver2.setMaxIterations(0);
        int int19 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((-1));
        java.lang.Class<?> wildcardClass22 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int11 = simplexSolver2.getIterations();
        int int12 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(10);
        simplexSolver0.setMaxIterations(35);
        int int9 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), 97);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
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
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(32);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        int int6 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, 35);
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
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int5 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), (int) (short) 10);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations((int) 'a');
        int int14 = simplexSolver2.getIterations();
        int int15 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) 'a');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
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
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) '4');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) '#');
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, (int) (byte) 100);
        simplexSolver2.setMaxIterations((int) (byte) 10);
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
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((-1.0d), (int) (short) 1);
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
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) 'a');
        simplexSolver2.setMaxIterations((-1));
        int int5 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) '#');
        simplexSolver2.setMaxIterations(97);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) 'a');
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
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
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((-1));
        int int9 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), (-1));
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
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, (int) '#');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        simplexSolver2.setMaxIterations((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) 100);
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass11 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) 'a');
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
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, 0);
        simplexSolver2.setMaxIterations(97);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) '4');
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int9 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) 10);
        simplexSolver2.setMaxIterations(100);
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
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
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
        int int16 = simplexSolver2.getIterations();
        int int17 = simplexSolver2.getMaxIterations();
        int int18 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (-1));
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getMaxIterations();
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
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (short) -1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, 10);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int6 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getIterations();
        int int12 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass13 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, (int) (byte) -1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((-1));
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (short) 100);
        simplexSolver2.setMaxIterations(52);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int11 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray15);
        org.junit.Assert.assertArrayEquals(linearConstraintArray15, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 97, (int) (byte) -1);
        simplexSolver2.setMaxIterations((int) ' ');
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) -1);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(32);
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, 1);
        simplexSolver2.setMaxIterations(32);
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (short) 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int16 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
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
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 97, (int) ' ');
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', (int) (short) 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int12 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction13 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray14 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList15 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList15, linearConstraintArray14);
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair19 = simplexSolver2.optimize(linearObjectiveFunction13, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList15, goalType17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray14);
        org.junit.Assert.assertArrayEquals(linearConstraintArray14, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) (byte) 0);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 52);
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
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = simplexSolver2.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, (int) (byte) 100);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int16 = simplexSolver2.getMaxIterations();
        int int17 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction18 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray19 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList20 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList20, linearConstraintArray19);
        org.apache.commons.math3.optimization.GoalType goalType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair24 = simplexSolver2.optimize(linearObjectiveFunction18, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList20, goalType22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(linearConstraintArray19);
        org.junit.Assert.assertArrayEquals(linearConstraintArray19, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        simplexSolver2.setMaxIterations((int) 'a');
        int int8 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, (int) (short) 10);
        simplexSolver2.setMaxIterations(1);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) ' ');
        simplexSolver2.setMaxIterations((int) ' ');
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        int int9 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getMaxIterations();
        int int14 = simplexSolver2.getIterations();
        int int15 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, 52);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, (int) (short) 1);
        simplexSolver2.setMaxIterations(97);
        int int5 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
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
        int int16 = simplexSolver2.getMaxIterations();
        int int17 = simplexSolver2.getIterations();
        int int18 = simplexSolver2.getIterations();
        int int19 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 97, (int) (byte) -1);
        simplexSolver2.setMaxIterations(32);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int8 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, 52);
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
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 100);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        int int6 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, (int) (short) 1);
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
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((int) (byte) -1);
        simplexSolver0.setMaxIterations(32);
        simplexSolver0.setMaxIterations(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, 52);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int15 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations(52);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, (int) '#');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(32);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        int int12 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, (int) (byte) 100);
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
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 52);
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
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int12 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, (int) (short) 1);
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        int int8 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), (int) (byte) 1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) (byte) 1);
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
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, 10);
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (short) -1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '#');
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
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations((int) 'a');
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int16 = simplexSolver2.getIterations();
        int int17 = simplexSolver2.getMaxIterations();
        int int18 = simplexSolver2.getMaxIterations();
        int int19 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction20 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray21 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList22 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList22, linearConstraintArray21);
        org.apache.commons.math3.optimization.GoalType goalType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair26 = simplexSolver2.optimize(linearObjectiveFunction20, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList22, goalType24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(linearConstraintArray21);
        org.junit.Assert.assertArrayEquals(linearConstraintArray21, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass13 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int16 = simplexSolver2.getMaxIterations();
        int int17 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau18 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        int int3 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass11 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations(0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) '4');
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(10);
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) 'a');
        simplexSolver2.setMaxIterations((-1));
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 1);
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction13 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray14 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList15 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList15, linearConstraintArray14);
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair19 = simplexSolver2.optimize(linearObjectiveFunction13, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList15, goalType17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray14);
        org.junit.Assert.assertArrayEquals(linearConstraintArray14, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (byte) 100);
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
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations((int) '4');
        java.lang.Class<?> wildcardClass8 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int12 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int15 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, 1);
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations((int) '#');
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int11 = simplexSolver2.getIterations();
        int int12 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int15 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) '4');
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(35);
        simplexSolver0.setMaxIterations(10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, 35);
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, 1);
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
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getIterations();
        int int12 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau14);
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
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(35);
        int int6 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) ' ');
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
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(10);
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction13 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray14 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList15 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList15, linearConstraintArray14);
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair19 = simplexSolver2.optimize(linearObjectiveFunction13, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList15, goalType17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray14);
        org.junit.Assert.assertArrayEquals(linearConstraintArray14, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int12 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        simplexSolver2.setMaxIterations((int) 'a');
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
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, (int) (short) 1);
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, (int) 'a');
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (-1));
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int12 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
        simplexSolver2.setMaxIterations((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int4 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int10 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((-1));
        simplexSolver0.setMaxIterations((int) (byte) -1);
        int int15 = simplexSolver0.getMaxIterations();
        int int16 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, (int) (byte) 100);
        simplexSolver2.setMaxIterations(32);
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
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations(97);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (short) 1);
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
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        int int12 = simplexSolver2.getIterations();
        int int13 = simplexSolver2.getIterations();
        int int14 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass15 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) 1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(52);
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
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction6 = null;
        java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintCollection7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = simplexSolver2.optimize(linearObjectiveFunction6, linearConstraintCollection7, goalType8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, (-1));
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
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
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
        simplexSolver2.setMaxIterations((int) (byte) -1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau18 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 1);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 1);
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, (int) (byte) 100);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, 0);
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, 52);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) 0);
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
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) 'a');
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', (int) (short) -1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
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
            org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = simplexSolver2.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, true);
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
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (short) 1);
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
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int11 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations(10);
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray16);
        org.junit.Assert.assertArrayEquals(linearConstraintArray16, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', (int) (byte) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((-1));
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
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 100, (int) (byte) 100);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (-1));
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(35);
        int int6 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        simplexSolver0.setMaxIterations(35);
        simplexSolver0.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, 100);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) ' ');
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) '#');
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) '4');
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
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) '#');
        simplexSolver2.setMaxIterations(97);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), 35);
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', (int) (byte) 10);
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
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) '4');
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
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 0);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', (int) (short) 1);
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
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, 35);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) '4');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 'a', (int) (byte) -1);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations(10);
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
        int int15 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) ' ');
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        simplexSolver2.setMaxIterations((int) 'a');
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
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
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(32);
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations(10);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, 10);
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
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
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
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(35);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int13 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass14 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (byte) 100);
        simplexSolver2.setMaxIterations((int) ' ');
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) '#');
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', (int) (byte) 100);
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
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, 10);
        simplexSolver2.setMaxIterations((int) (byte) 100);
        simplexSolver2.setMaxIterations(97);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', (int) (byte) 0);
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (byte) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) 'a');
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (int) 'a');
        simplexSolver2.setMaxIterations((int) 'a');
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, (int) (short) 0);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) '4');
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
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
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (byte) -1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(52);
        int int6 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (short) -1);
        simplexSolver2.setMaxIterations((int) (byte) -1);
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
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction13 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray14 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList15 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList15, linearConstraintArray14);
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair19 = simplexSolver2.optimize(linearObjectiveFunction13, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList15, goalType17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray14);
        org.junit.Assert.assertArrayEquals(linearConstraintArray14, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) '#');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, (int) (byte) 100);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), 97);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) '4');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
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
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, (int) ' ');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
        simplexSolver2.setMaxIterations((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) -1);
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
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) ' ');
        int int10 = simplexSolver0.getMaxIterations();
        int int11 = simplexSolver0.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction7 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray8 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList9 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, linearConstraintArray8);
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = simplexSolver0.optimize(linearObjectiveFunction7, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList9, goalType11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
        int int9 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, 35);
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
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int14 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int17 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
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
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, 97);
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
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(10);
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
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) '4');
        simplexSolver2.setMaxIterations(35);
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
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) ' ');
        simplexSolver2.setMaxIterations((int) (short) 100);
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
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) (byte) -1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int7 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, 35);
        simplexSolver2.setMaxIterations(97);
        simplexSolver2.setMaxIterations(1);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations((int) 'a');
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int18 = simplexSolver2.getMaxIterations();
        int int19 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass20 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (byte) -1);
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
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int12 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass13 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, 52);
        simplexSolver2.setMaxIterations((int) (byte) 0);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) '4');
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (int) 'a');
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
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '#');
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getIterations();
        int int13 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(32);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        int int13 = simplexSolver2.getMaxIterations();
        int int14 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) '#');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int7 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', (int) (byte) 10);
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
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, (int) '4');
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
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (-1));
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((-1.0d), (int) 'a');
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
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) ' ');
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int14 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 1);
        int int21 = simplexSolver2.getIterations();
        int int22 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, (int) (short) 10);
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
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, (int) (byte) 1);
        simplexSolver2.setMaxIterations((int) '4');
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
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 'a', (int) '#');
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), 32);
        simplexSolver2.setMaxIterations(97);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 'a', (int) (byte) 100);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(32);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        java.lang.Class<?> wildcardClass11 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) 'a');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) '4');
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
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) '4');
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(52);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, (int) (short) 0);
        int int3 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(97);
        int int6 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 10);
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
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
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
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (-1));
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(32);
        int int15 = simplexSolver2.getIterations();
        int int16 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((-1.0d), (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int10 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((-1.0d), (int) (byte) 10);
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
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (-1));
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int9 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations(32);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) (byte) 10);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (short) 1);
        simplexSolver2.setMaxIterations(35);
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass13 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), 10);
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
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), 97);
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
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) 1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, 10);
        simplexSolver2.setMaxIterations((int) ' ');
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations(1);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray17);
        org.junit.Assert.assertArrayEquals(linearConstraintArray17, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (int) (byte) 10);
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
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) '4');
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        int int6 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(32);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        int int13 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction14 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray15 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList16 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList16, linearConstraintArray15);
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair20 = simplexSolver2.optimize(linearObjectiveFunction14, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList16, goalType18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(linearConstraintArray15);
        org.junit.Assert.assertArrayEquals(linearConstraintArray15, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) '4');
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((-1));
        int int7 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass8 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) '#');
        simplexSolver2.setMaxIterations(97);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, (int) (short) -1);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, 32);
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', 97);
        simplexSolver2.setMaxIterations((int) (byte) 0);
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
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(97);
        int int6 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (byte) 1);
        simplexSolver2.setMaxIterations((int) '4');
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass11 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (byte) 10);
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
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (-1));
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
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) -1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, 100);
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
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) 'a');
        simplexSolver2.setMaxIterations((-1));
        simplexSolver2.setMaxIterations(52);
        int int7 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 100, (int) (byte) 100);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (short) 100);
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int7 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, (int) (byte) 1);
        simplexSolver2.setMaxIterations((int) (byte) -1);
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
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int4 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int10 = simplexSolver0.getIterations();
        int int11 = simplexSolver0.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, 0);
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (byte) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
        int int7 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass8 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) '#');
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 'a', 1);
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
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, (int) (short) 0);
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
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, 35);
        int int3 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getMaxIterations();
        int int13 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, 32);
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
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, 32);
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
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) '4');
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 52);
        simplexSolver2.setMaxIterations((int) '4');
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
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations(52);
        int int9 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass10 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, (int) (byte) -1);
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int5 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, 97);
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
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, (int) (byte) -1);
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
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, 10);
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
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 97, (int) (byte) -1);
        simplexSolver2.setMaxIterations(32);
        simplexSolver2.setMaxIterations((int) (byte) 10);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        java.lang.Class<?> wildcardClass8 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) '4');
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((-1));
        int int11 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
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
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', (int) (short) 100);
        simplexSolver2.setMaxIterations((-1));
        int int5 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) (short) 100);
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int7 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) ' ');
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 1);
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
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) (byte) 100);
        simplexSolver2.setMaxIterations(10);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((-1));
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
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(32);
        int int9 = simplexSolver0.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction10 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray11 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList12 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList12, linearConstraintArray11);
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = simplexSolver0.optimize(linearObjectiveFunction10, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList12, goalType14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations(1);
        simplexSolver2.setMaxIterations((int) (short) 1);
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int9 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int9 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction10 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray11 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList12 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList12, linearConstraintArray11);
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = simplexSolver2.optimize(linearObjectiveFunction10, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList12, goalType14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) (short) 1);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(32);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (-1));
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
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, 100);
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
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(1);
        java.lang.Class<?> wildcardClass8 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (byte) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        int int6 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int12 = simplexSolver2.getIterations();
        int int13 = simplexSolver2.getIterations();
        int int14 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int17 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau18 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) '4');
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
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, 35);
        simplexSolver2.setMaxIterations(100);
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, 32);
        simplexSolver2.setMaxIterations((int) (short) -1);
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
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', 10);
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
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', (int) (short) -1);
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
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, 0);
        simplexSolver2.setMaxIterations(97);
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int12 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass13 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, (int) (byte) 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(32);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int14 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) (short) 1);
        int int19 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau20 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), 52);
        simplexSolver2.setMaxIterations((int) (short) 1);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass10 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int11 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
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
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
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
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (int) (byte) 10);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (int) ' ');
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(32);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) (byte) -1);
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
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 97);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        java.lang.Class<?> wildcardClass8 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (-1));
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int5 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        int int8 = simplexSolver0.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction9 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray10 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList11 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, linearConstraintArray10);
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = simplexSolver0.optimize(linearObjectiveFunction9, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList11, goalType13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 100);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
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
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (short) 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (short) 0);
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
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((-1));
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction11 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray12 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList13 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList13, linearConstraintArray12);
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = simplexSolver2.optimize(linearObjectiveFunction11, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList13, goalType15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 52);
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
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((-1));
        int int12 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((-1.0d), 35);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction3 = null;
        java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintCollection4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = simplexSolver2.optimize(linearObjectiveFunction3, linearConstraintCollection4, goalType5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), 97);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int7 = simplexSolver0.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }
}

