package org.apache.commons.math.optimization.linear;

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
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100.0f, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 10.0f, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, 10.0d, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (-1.0f), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (-1.0d), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, 1.0d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100.0f, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (-1.0f), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (-1L), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, 100.0d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, 1.0d, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (-1.0d), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 0.0f, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (-1.0f), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, 10.0d, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1.0f, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 10.0f, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (-1.0f), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (-1L), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, 1.0d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (-1.0d), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (-1.0d), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (-1.0d), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1.0f, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 100.0f, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 10L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 100.0f, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, 1.0d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100.0f, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 1L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1.0f, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 10.0f, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (-1.0f), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 0L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 10L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 100.0f, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 10L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (-1.0f), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, 100.0d, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 1.0f, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 100L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 0.0f, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (-1.0f), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 10L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 0L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100.0f, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 1.0f, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 0L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (-1L), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 1L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 10L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 10.0f, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1.0f, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, 10.0d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 1.0f, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 100L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, 100.0d, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, 10.0d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, 10.0d, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (-1.0d), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 10L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 10L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 100.0f, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, 10.0d, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 1L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 10L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (-1L), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 0L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 10L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100.0f, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 100.0f, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, 1.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, 10.0d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (-1.0f), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 100L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (-1.0d), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, 10.0d, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, true, (double) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = null;
        java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintCollection1 = null;
        org.apache.commons.math.optimization.GoalType goalType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0, linearConstraintCollection1, goalType2, false, (double) 0.0f, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

