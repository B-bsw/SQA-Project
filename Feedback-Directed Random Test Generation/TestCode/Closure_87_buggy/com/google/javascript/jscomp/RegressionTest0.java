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
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax();
        com.google.javascript.rhino.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax();
        java.lang.Class<?> wildcardClass1 = peepholeSubstituteAlternateSyntax0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate0 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE;
        java.lang.Class<?> wildcardClass1 = nodePredicate0.getClass();
        org.junit.Assert.assertNotNull(nodePredicate0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.INVALID_REGULAR_EXPRESSION_FLAGS;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

