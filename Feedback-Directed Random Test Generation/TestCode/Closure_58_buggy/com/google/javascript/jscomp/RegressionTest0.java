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
        java.lang.String str0 = com.google.javascript.jscomp.LiveVariablesAnalysis.ARGUMENT_ARRAY_ALIAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "arguments" + "'", str0, "arguments");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph0 = null;
        com.google.javascript.jscomp.Scope scope1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.LiveVariablesAnalysis liveVariablesAnalysis3 = new com.google.javascript.jscomp.LiveVariablesAnalysis(nodeControlFlowGraph0, scope1, abstractCompiler2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        int int0 = com.google.javascript.jscomp.DataFlowAnalysis.MAX_STEPS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 200000 + "'", int0 == 200000);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

