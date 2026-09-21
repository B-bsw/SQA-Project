package com.google.javascript.jscomp;

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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.RemoveUnusedVars removeUnusedVars4 = new com.google.javascript.jscomp.RemoveUnusedVars(abstractCompiler0, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.RemoveUnusedVars removeUnusedVars4 = new com.google.javascript.jscomp.RemoveUnusedVars(abstractCompiler0, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.RemoveUnusedVars removeUnusedVars4 = new com.google.javascript.jscomp.RemoveUnusedVars(abstractCompiler0, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.RemoveUnusedVars removeUnusedVars4 = new com.google.javascript.jscomp.RemoveUnusedVars(abstractCompiler0, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.RemoveUnusedVars removeUnusedVars4 = new com.google.javascript.jscomp.RemoveUnusedVars(abstractCompiler0, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.RemoveUnusedVars removeUnusedVars4 = new com.google.javascript.jscomp.RemoveUnusedVars(abstractCompiler0, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.RemoveUnusedVars removeUnusedVars4 = new com.google.javascript.jscomp.RemoveUnusedVars(abstractCompiler0, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test9");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.RemoveUnusedVars removeUnusedVars4 = new com.google.javascript.jscomp.RemoveUnusedVars(abstractCompiler0, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

