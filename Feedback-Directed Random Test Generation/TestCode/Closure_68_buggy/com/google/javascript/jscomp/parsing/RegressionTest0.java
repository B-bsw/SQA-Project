package com.google.javascript.jscomp.parsing;

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
        com.google.javascript.jscomp.parsing.JsDocTokenStream jsDocTokenStream0 = null;
        com.google.javascript.jscomp.mozilla.rhino.ast.Comment comment1 = null;
        com.google.javascript.jscomp.parsing.Config config3 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.parsing.JsDocInfoParser jsDocInfoParser5 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(jsDocTokenStream0, comment1, "", config3, errorReporter4);
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
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString("hi!");
        java.lang.Class<?> wildcardClass2 = node1.getClass();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString("");
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        com.google.javascript.jscomp.parsing.JsDocTokenStream jsDocTokenStream0 = null;
        com.google.javascript.jscomp.mozilla.rhino.ast.Comment comment1 = null;
        com.google.javascript.jscomp.parsing.Config config3 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.parsing.JsDocInfoParser jsDocInfoParser5 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(jsDocTokenStream0, comment1, "hi!", config3, errorReporter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

