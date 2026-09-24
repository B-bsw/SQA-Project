package org.apache.commons.math.analysis.solvers;

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method method0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.PEGASUS;
        java.lang.Class<?> wildcardClass1 = method0.getClass();
        org.junit.Assert.assertTrue("'" + method0 + "' != '" + org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.PEGASUS + "'", method0.equals(org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.PEGASUS));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method method0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.REGULA_FALSI;
        java.lang.Class<?> wildcardClass1 = method0.getClass();
        org.junit.Assert.assertTrue("'" + method0 + "' != '" + org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.REGULA_FALSI + "'", method0.equals(org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.REGULA_FALSI));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        double double0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0E-6d + "'", double0 == 1.0E-6d);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method method0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.ILLINOIS;
        java.lang.Class<?> wildcardClass1 = method0.getClass();
        org.junit.Assert.assertTrue("'" + method0 + "' != '" + org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.ILLINOIS + "'", method0.equals(org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.ILLINOIS));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

