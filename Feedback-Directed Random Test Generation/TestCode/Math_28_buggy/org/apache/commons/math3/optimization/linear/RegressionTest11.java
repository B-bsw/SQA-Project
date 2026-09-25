package org.apache.commons.math3.optimization.linear;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) (byte) 10);
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
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (-1));
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
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) '4');
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) 'a');
        int int14 = simplexSolver2.getIterations();
        int int15 = simplexSolver2.getIterations();
        int int16 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 52);
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(52);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', (int) (byte) -1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        simplexSolver2.setMaxIterations(32);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, 35);
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
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) '4');
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) 'a');
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (int) (byte) 1);
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', 97);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (byte) 100);
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
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (short) 100);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(97);
        int int9 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 52);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (int) (byte) 0);
        simplexSolver2.setMaxIterations((int) ' ');
        int int5 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(35);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(10);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations((int) 'a');
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, (int) (short) 10);
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
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
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
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((-1));
        int int10 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
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
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 97, (int) (short) 1);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        simplexSolver2.setMaxIterations((-1));
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, 0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(97);
        int int7 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int13 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (byte) -1);
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
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getIterations();
        int int11 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) '#');
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((-1));
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) '4');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
        simplexSolver2.setMaxIterations(10);
        int int13 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        int int6 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, 0);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, 97);
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
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) 'a');
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        int int6 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass10 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, 32);
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
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '#');
        int int11 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        simplexSolver2.setMaxIterations(1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau11);
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
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', 1);
        simplexSolver2.setMaxIterations((int) '4');
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
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations(1);
        simplexSolver2.setMaxIterations((int) (byte) 100);
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
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (-1));
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) '4');
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        java.lang.Class<?> wildcardClass8 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, 97);
        simplexSolver2.setMaxIterations((int) '#');
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int12 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) '4');
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
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '#');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) (byte) 0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        simplexSolver2.setMaxIterations(52);
        int int11 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 35);
        simplexSolver2.setMaxIterations(52);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, 35);
        simplexSolver2.setMaxIterations((int) (byte) 10);
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
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) (byte) 100);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        int int8 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, 32);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations(10);
        simplexSolver2.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (short) 10);
        simplexSolver2.setMaxIterations(32);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
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
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int4 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getMaxIterations();
        int int11 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(35);
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) 'a');
        simplexSolver2.setMaxIterations((int) (short) 100);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(35);
        int int11 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (short) 10);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, 1);
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
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, 52);
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, 10);
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
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) ' ');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int10 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
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
        simplexSolver2.setMaxIterations((int) (short) 1);
        int int18 = simplexSolver2.getIterations();
        int int19 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
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
        int int17 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, (int) '4');
        simplexSolver2.setMaxIterations(100);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, 100);
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
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), 52);
        simplexSolver2.setMaxIterations((int) 'a');
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        int int13 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray15);
        org.junit.Assert.assertArrayEquals(linearConstraintArray15, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(52);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
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
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (byte) 10);
        simplexSolver2.setMaxIterations(0);
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        int int8 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) (byte) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((-1));
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int9 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, 35);
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
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) '4');
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) 'a');
        int int14 = simplexSolver2.getIterations();
        int int15 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass16 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) (short) 1);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), 0);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((-1.0d), (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) '4');
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) (short) -1);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int5 = simplexSolver0.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) ' ');
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) '#');
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
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (int) (short) 10);
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
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) (short) 100);
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
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(0);
        int int9 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 52);
        simplexSolver2.setMaxIterations((int) '4');
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, 35);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) (short) 10);
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
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (-1));
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(32);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (short) 100);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 'a', (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (byte) -1);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (int) (short) 10);
        simplexSolver2.setMaxIterations((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations((int) '#');
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(1);
        int int14 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) '4');
        simplexSolver2.setMaxIterations((int) (byte) 0);
        simplexSolver2.setMaxIterations(1);
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
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, (int) (short) 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        simplexSolver2.setMaxIterations(0);
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
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, 52);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) 'a');
        simplexSolver2.setMaxIterations(100);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (int) (byte) -1);
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
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (-1));
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 52);
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) ' ');
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) '#');
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), 52);
        int int3 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) 1);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations(1);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction8 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray9 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList10 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, linearConstraintArray9);
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = simplexSolver0.optimize(linearObjectiveFunction8, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList10, goalType12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        simplexSolver2.setMaxIterations((int) '#');
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 100, (int) '4');
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (-1));
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int8 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, (int) '4');
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
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray16);
        org.junit.Assert.assertArrayEquals(linearConstraintArray16, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) ' ');
        simplexSolver2.setMaxIterations((int) '4');
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
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
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, (int) '4');
        simplexSolver2.setMaxIterations(10);
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(97);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int7 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, 10);
        simplexSolver2.setMaxIterations((int) '#');
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 100);
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (-1));
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
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
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int10 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(10);
        int int9 = simplexSolver0.getMaxIterations();
        java.lang.Class<?> wildcardClass10 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int7 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (short) 100);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
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
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int17 = simplexSolver2.getMaxIterations();
        int int18 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction19 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray20 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList21 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList21, linearConstraintArray20);
        org.apache.commons.math3.optimization.GoalType goalType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair25 = simplexSolver2.optimize(linearObjectiveFunction19, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList21, goalType23, false);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray20);
        org.junit.Assert.assertArrayEquals(linearConstraintArray20, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations((int) '#');
        int int14 = simplexSolver2.getMaxIterations();
        int int15 = simplexSolver2.getMaxIterations();
        int int16 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, 1);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) -1);
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
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', (int) (short) 100);
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
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
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
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int21 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) 10);
        simplexSolver2.setMaxIterations(0);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, 97);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) ' ');
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (short) -1);
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (byte) 1);
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
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, 1);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), 32);
        simplexSolver2.setMaxIterations(97);
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
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) '4');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(32);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int11 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (-1));
        int int3 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, (-1));
        simplexSolver2.setMaxIterations((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), 0);
        simplexSolver2.setMaxIterations((int) (byte) 0);
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
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, (int) (byte) 1);
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (short) 0);
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
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (byte) 1);
        simplexSolver2.setMaxIterations((int) '4');
        int int5 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass6 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        simplexSolver2.setMaxIterations((int) 'a');
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(linearConstraintArray14);
        org.junit.Assert.assertArrayEquals(linearConstraintArray14, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) 'a');
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (short) 100);
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
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, (int) (short) 10);
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
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) 10);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, (int) 'a');
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
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getMaxIterations();
        java.lang.Class<?> wildcardClass10 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations(0);
        int int13 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int12 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass13 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) (short) 100);
        simplexSolver2.setMaxIterations(100);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, (int) 'a');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) '#');
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
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
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
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction17 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray18 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList19 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList19, linearConstraintArray18);
        org.apache.commons.math3.optimization.GoalType goalType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair23 = simplexSolver2.optimize(linearObjectiveFunction17, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList19, goalType21, false);
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
        org.junit.Assert.assertNotNull(linearConstraintArray18);
        org.junit.Assert.assertArrayEquals(linearConstraintArray18, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), 52);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations((int) '#');
        int int6 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((-1));
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int12 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, 100);
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
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) ' ');
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
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations((int) 'a');
        java.lang.Class<?> wildcardClass11 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) 'a');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, 10);
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (short) 10);
        simplexSolver2.setMaxIterations((int) (short) 0);
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
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (-1));
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations((int) ' ');
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) (byte) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        simplexSolver2.setMaxIterations((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (short) -1);
        simplexSolver2.setMaxIterations((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (-1));
        simplexSolver2.setMaxIterations((int) (byte) 1);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int4 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int12 = simplexSolver0.getIterations();
        int int13 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(32);
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        int int12 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((int) (byte) -1);
        int int7 = simplexSolver0.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', 52);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) (byte) 0);
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
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, (int) (short) 1);
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
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (-1));
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
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 1);
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, 32);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), 0);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) 'a');
        simplexSolver2.setMaxIterations((-1));
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int8 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) '4');
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(1);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, (int) (byte) 1);
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) 0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 10);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (int) (short) 10);
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
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (-1));
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
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
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) '#');
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
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        int int6 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray9);
        org.junit.Assert.assertArrayEquals(linearConstraintArray9, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(32);
        int int11 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) 0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) '4');
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass10 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau13);
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
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, 52);
        simplexSolver2.setMaxIterations((int) (byte) 10);
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
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, (int) (byte) 0);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(52);
        int int12 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations(10);
        java.lang.Class<?> wildcardClass13 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        simplexSolver2.setMaxIterations(32);
        int int12 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations((int) '#');
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 100, 52);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(97);
        int int11 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getIterations();
        int int13 = simplexSolver2.getIterations();
        int int14 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, (int) '#');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', 100);
        simplexSolver2.setMaxIterations((int) '#');
        int int5 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int15 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((-1.0d), 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int6 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
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
        simplexSolver2.setMaxIterations(52);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau21 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (int) 'a');
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
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) 'a');
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
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) '4');
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) '4');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, 32);
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), 0);
        simplexSolver2.setMaxIterations(32);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        simplexSolver2.setMaxIterations((int) 'a');
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(32);
        simplexSolver2.setMaxIterations(52);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) '#');
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray16);
        org.junit.Assert.assertArrayEquals(linearConstraintArray16, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (-1));
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
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations((int) '#');
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) '4');
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations(52);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', (int) (byte) 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations((int) '4');
        java.lang.Class<?> wildcardClass8 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations(52);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) ' ');
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) 'a');
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
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
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int5 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (byte) 100);
        simplexSolver2.setMaxIterations((int) ' ');
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, (int) (byte) 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) (byte) -1);
        simplexSolver2.setMaxIterations((int) (byte) 1);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) -1);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (byte) -1);
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        java.lang.Class<?> wildcardClass10 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, 97);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        simplexSolver2.setMaxIterations(32);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) 10);
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
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, (int) (short) -1);
        int int3 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, (int) 'a');
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
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(52);
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
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int7 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 0);
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations(32);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) 'a');
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) (short) 0);
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
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, 52);
        simplexSolver2.setMaxIterations(10);
        int int5 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', 32);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) 'a');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (short) 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) 'a');
        simplexSolver2.setMaxIterations((-1));
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        simplexSolver2.setMaxIterations(0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (int) (byte) 0);
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
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) ' ');
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(97);
        int int9 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) (byte) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
        int int7 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) ' ');
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int15 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 52);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (int) 'a');
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
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int10 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass11 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) '4');
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
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(1);
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
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int6 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
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
        int int18 = simplexSolver2.getIterations();
        int int19 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau20 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
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
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10.0f, 0);
        simplexSolver2.setMaxIterations(1);
        simplexSolver2.setMaxIterations((int) (short) 1);
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int12 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) 'a');
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (-1));
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(32);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) 'a');
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((-1));
        simplexSolver2.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
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
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) '#');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) 'a');
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations(32);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) '4');
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(10);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, (int) '#');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) (short) 10);
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
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
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
        java.lang.Class<?> wildcardClass16 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, 100);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((int) (byte) -1);
        simplexSolver0.setMaxIterations(32);
        int int9 = simplexSolver0.getMaxIterations();
        int int10 = simplexSolver0.getMaxIterations();
        int int11 = simplexSolver0.getMaxIterations();
        int int12 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((-1));
        simplexSolver2.setMaxIterations(0);
        int int9 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(52);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int9 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        java.lang.Class<?> wildcardClass8 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(10);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '#');
        int int11 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(97);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
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
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) '4');
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
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(52);
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
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, (int) (short) 10);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int5 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int12 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction13 = null;
        java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintCollection14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = simplexSolver2.optimize(linearObjectiveFunction13, linearConstraintCollection14, goalType15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
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
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, 10);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(35);
        simplexSolver2.setMaxIterations((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) '4');
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(1);
        int int8 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
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
        simplexSolver2.setMaxIterations((int) (short) -1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau21 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, 97);
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
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        simplexSolver2.setMaxIterations(100);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(97);
        int int7 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(0);
        int int9 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass10 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', (int) '4');
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
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) ' ');
        simplexSolver2.setMaxIterations(35);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((-1));
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
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) ' ');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
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
            org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = simplexSolver2.optimize(linearObjectiveFunction6, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList8, goalType10, true);
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
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
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
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (short) -1);
        simplexSolver2.setMaxIterations((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(linearConstraintArray8);
        org.junit.Assert.assertArrayEquals(linearConstraintArray8, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) '4');
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
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, 97);
        simplexSolver2.setMaxIterations((int) (short) -1);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) '4');
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 97, (int) '4');
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int10 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) '#');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        simplexSolver2.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 100, (int) ' ');
        simplexSolver2.setMaxIterations(35);
        int int5 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, (int) (byte) -1);
        simplexSolver2.setMaxIterations((int) (short) 1);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, 97);
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
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 97, (int) (byte) -1);
        simplexSolver2.setMaxIterations(32);
        simplexSolver2.setMaxIterations((int) (short) 10);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, (int) (byte) 1);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (int) ' ');
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
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, 97);
        simplexSolver2.setMaxIterations((-1));
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
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
        int int16 = simplexSolver2.getIterations();
        int int17 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        int int20 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 0);
        simplexSolver2.setMaxIterations(100);
        int int5 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, 0);
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations(0);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10, 52);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (-1) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', (int) (byte) 0);
        simplexSolver2.setMaxIterations(100);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 100, (int) (short) 100);
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
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int13 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', 10);
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 10, (int) (byte) 100);
        simplexSolver2.setMaxIterations((int) ' ');
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (byte) -1);
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int9 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) '4');
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) 'a');
        int int7 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        int int5 = simplexSolver0.getIterations();
        java.lang.Class<?> wildcardClass6 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, (int) ' ');
        simplexSolver2.setMaxIterations((int) (byte) 10);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) (short) -1);
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
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int8 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException; message: illegal state: maximal count (0) exceeded");
        } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (byte) -1);
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int9 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, 10);
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
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
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
        int int18 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau19 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, (int) (short) 10);
        simplexSolver2.setMaxIterations((int) (short) 1);
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
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) (byte) 10);
        int int3 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray6);
        org.junit.Assert.assertArrayEquals(linearConstraintArray6, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1L, (int) (short) 0);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) (byte) 10);
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
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations((int) (byte) -1);
        simplexSolver2.setMaxIterations((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100.0f, (int) (byte) 10);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) 'a');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau12);
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
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass10 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) 'a');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 100, 97);
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(10);
        int int9 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, (-1));
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations((int) ' ');
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        int int13 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(35);
        int int6 = simplexSolver0.getMaxIterations();
        java.lang.Class<?> wildcardClass7 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations(10);
        int int11 = simplexSolver2.getIterations();
        int int12 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass13 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 1, (int) (short) 0);
        simplexSolver2.setMaxIterations(35);
        simplexSolver2.setMaxIterations(32);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) ' ');
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
        int int10 = simplexSolver2.getMaxIterations();
        int int11 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, 1);
        simplexSolver2.setMaxIterations((int) 'a');
        java.lang.Class<?> wildcardClass5 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int11 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        int int7 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((-1.0d), 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 10);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(35);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (byte) -1);
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
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, (int) '#');
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
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) '4');
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
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(10);
        simplexSolver2.setMaxIterations((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) '4');
        simplexSolver2.setMaxIterations(100);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        simplexSolver2.setMaxIterations(35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int9 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int12 = simplexSolver2.getIterations();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 0, (int) '4');
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '#');
        int int11 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(97);
        simplexSolver2.setMaxIterations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '4', (-1));
        int int3 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(linearConstraintArray7);
        org.junit.Assert.assertArrayEquals(linearConstraintArray7, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getMaxIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) ' ');
        java.lang.Class<?> wildcardClass10 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (int) '4');
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 1, 10);
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
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 1);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, (int) (short) 1);
        simplexSolver2.setMaxIterations((int) '#');
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.doIteration(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, 100);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        simplexSolver2.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, (int) 'a');
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(100);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(97);
        int int12 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(1);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction15 = null;
        org.apache.commons.math3.optimization.linear.LinearConstraint[] linearConstraintArray16 = new org.apache.commons.math3.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraintList17 = new java.util.ArrayList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList17, linearConstraintArray16);
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair21 = simplexSolver0.optimize(linearObjectiveFunction15, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList17, goalType19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray16);
        org.junit.Assert.assertArrayEquals(linearConstraintArray16, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) ' ', (int) 'a');
        simplexSolver2.setMaxIterations(52);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (int) (byte) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 100, (int) '4');
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
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
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
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int17 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) ' ');
        simplexSolver2.setMaxIterations(35);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((-1));
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (-1));
        simplexSolver2.setMaxIterations((int) (byte) 1);
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray10);
        org.junit.Assert.assertArrayEquals(linearConstraintArray10, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) 1);
        simplexSolver2.setMaxIterations(52);
        simplexSolver2.setMaxIterations((int) (byte) 0);
        simplexSolver2.setMaxIterations((int) (short) 1);
        int int15 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, 35);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) -1, 0);
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
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) (short) 100);
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
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, (int) ' ');
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int9 = simplexSolver2.getMaxIterations();
        int int10 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray15);
        org.junit.Assert.assertArrayEquals(linearConstraintArray15, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations((int) '#');
        int int14 = simplexSolver2.getMaxIterations();
        int int15 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (int) '4');
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        int int7 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (byte) -1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        int int7 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, 1);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(10.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (short) 100);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) ' ');
        simplexSolver2.setMaxIterations((int) ' ');
        simplexSolver2.setMaxIterations((int) (short) -1);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations(10);
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int13 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (-1));
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        int int7 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1, (int) ' ');
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
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0L, 97);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), (int) (byte) 10);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) -1);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations((int) (byte) 1);
        simplexSolver2.setMaxIterations(100);
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int11 = simplexSolver2.getMaxIterations();
        int int12 = simplexSolver2.getIterations();
        java.lang.Class<?> wildcardClass13 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) '4');
        simplexSolver2.setMaxIterations((-1));
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100, (int) 'a');
        simplexSolver2.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int8 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (short) 10);
        int int11 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass12 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(1.0d, (-1));
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(32);
        int int8 = simplexSolver2.getIterations();
        int int9 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 35, (int) (short) 100);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), 10);
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
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
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
        int int17 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
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
        simplexSolver2.setMaxIterations((int) (short) 100);
        int int21 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0.0f, (int) (short) 10);
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        simplexSolver2.setMaxIterations((int) (short) -1);
        simplexSolver2.setMaxIterations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        simplexSolver2.setMaxIterations(100);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getIterations();
        int int11 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations((-1));
        simplexSolver0.setMaxIterations(97);
        simplexSolver0.setMaxIterations((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', 100);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
        simplexSolver2.setMaxIterations(100);
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        simplexSolver0.setMaxIterations(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(35);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(52);
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 97, (int) (byte) -1);
        int int3 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) '#', (int) (short) 10);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
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
        int int17 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        int int20 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) 'a');
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau23 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau23);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, 97);
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
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) 'a');
        int int7 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        int int9 = simplexSolver2.getIterations();
        int int10 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray12);
        org.junit.Assert.assertArrayEquals(linearConstraintArray12, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 100L, (-1));
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 0, (int) (byte) -1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        int int5 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(100.0d, (int) (byte) 100);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(0);
        int int7 = simplexSolver2.getIterations();
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
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
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
        simplexSolver2.setMaxIterations((int) (short) 100);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau21 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
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
            org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = simplexSolver0.optimize(linearObjectiveFunction11, (java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint>) linearConstraintList13, goalType15, true);
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
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((-1.0d), 0);
        int int3 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) 0, (int) 'a');
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
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
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
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 32, 97);
        simplexSolver2.setMaxIterations((-1));
        int int5 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 1.0f, (int) (short) 0);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (byte) 10, (int) (short) 0);
        int int3 = simplexSolver2.getMaxIterations();
        int int4 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        int int7 = simplexSolver2.getMaxIterations();
        int int8 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations(0);
        int int13 = simplexSolver2.getMaxIterations();
        java.lang.Class<?> wildcardClass14 = simplexSolver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) (byte) 10);
        simplexSolver2.setMaxIterations(52);
        int int10 = simplexSolver2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (short) -1, (int) (short) 1);
        int int3 = simplexSolver2.getIterations();
        int int4 = simplexSolver2.getMaxIterations();
        int int5 = simplexSolver2.getMaxIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1), 0);
        int int3 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations(100);
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int9 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        int int12 = simplexSolver2.getIterations();
        int int13 = simplexSolver2.getIterations();
        simplexSolver2.setMaxIterations((int) '4');
        int int16 = simplexSolver2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1L), (int) '4');
        simplexSolver2.setMaxIterations((int) '#');
        simplexSolver2.setMaxIterations(0);
        java.lang.Class<?> wildcardClass7 = simplexSolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 10L, (int) (byte) -1);
        simplexSolver2.setMaxIterations(0);
        int int5 = simplexSolver2.getIterations();
        int int6 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations((int) (byte) 0);
        simplexSolver2.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) (-1.0f), (int) (short) 1);
        simplexSolver2.setMaxIterations((int) (short) 100);
        simplexSolver2.setMaxIterations((int) ' ');
        int int7 = simplexSolver2.getIterations();
        int int8 = simplexSolver2.getMaxIterations();
        int int9 = simplexSolver2.getMaxIterations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math3.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver(0.0d, (int) (short) -1);
        simplexSolver2.setMaxIterations((int) (byte) -1);
        int int5 = simplexSolver2.getMaxIterations();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver2.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }
}

