package org.apache.commons.math.optimization.linear;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.apache.commons.math.linear.RealVector realVector0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(realVector0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, true, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray1 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList2 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, linearConstraintArray1);
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList2, goalType4, false, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linearConstraintArray1);
        org.junit.Assert.assertArrayEquals(linearConstraintArray1, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau5 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

