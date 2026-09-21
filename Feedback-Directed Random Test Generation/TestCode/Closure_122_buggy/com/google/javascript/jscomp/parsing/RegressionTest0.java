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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String str0 = com.google.javascript.jscomp.parsing.IRFactory.GETTER_ERROR_MESSAGE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "getters are not supported in older versions of JavaScript. If you are targeting newer versions of JavaScript, set the appropriate language_in option." + "'", str0, "getters are not supported in older versions of JavaScript. If you are targeting newer versions of JavaScript, set the appropriate language_in option.");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.String str0 = com.google.javascript.jscomp.parsing.IRFactory.SUSPICIOUS_COMMENT_WARNING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Non-JSDoc comment has annotations. Did you mean to start it with '/**'?" + "'", str0, "Non-JSDoc comment has annotations. Did you mean to start it with '/**'?");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String str0 = com.google.javascript.jscomp.parsing.IRFactory.INVALID_ES3_PROP_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Keywords and reserved words are not allowed as unquoted property names in older versions of JavaScript. If you are targeting newer versions of JavaScript, set the appropriate language_in option." + "'", str0, "Keywords and reserved words are not allowed as unquoted property names in older versions of JavaScript. If you are targeting newer versions of JavaScript, set the appropriate language_in option.");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.String str0 = com.google.javascript.jscomp.parsing.IRFactory.SETTER_ERROR_MESSAGE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "setters are not supported in older versions of JavaScript. If you are targeting newer versions of JavaScript, set the appropriate language_in option." + "'", str0, "setters are not supported in older versions of JavaScript. If you are targeting newer versions of JavaScript, set the appropriate language_in option.");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String str0 = com.google.javascript.jscomp.parsing.IRFactory.MISPLACED_TYPE_ANNOTATION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Type annotations are not allowed here. Are you missing parentheses?" + "'", str0, "Type annotations are not allowed here. Are you missing parentheses?");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = null;
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile1 = null;
        com.google.javascript.jscomp.parsing.Config config3 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, staticSourceFile1, "hi!", config3, errorReporter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = null;
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile1 = null;
        com.google.javascript.jscomp.parsing.Config config3 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, staticSourceFile1, "", config3, errorReporter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = null;
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile1 = null;
        com.google.javascript.jscomp.parsing.Config config3 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, staticSourceFile1, "Non-JSDoc comment has annotations. Did you mean to start it with '/**'?", config3, errorReporter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = null;
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile1 = null;
        com.google.javascript.jscomp.parsing.Config config3 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, staticSourceFile1, "Type annotations are not allowed here. Are you missing parentheses?", config3, errorReporter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = null;
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile1 = null;
        com.google.javascript.jscomp.parsing.Config config3 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, staticSourceFile1, "setters are not supported in older versions of JavaScript. If you are targeting newer versions of JavaScript, set the appropriate language_in option.", config3, errorReporter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = null;
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile1 = null;
        com.google.javascript.jscomp.parsing.Config config3 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, staticSourceFile1, "Keywords and reserved words are not allowed as unquoted property names in older versions of JavaScript. If you are targeting newer versions of JavaScript, set the appropriate language_in option.", config3, errorReporter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.google.javascript.rhino.head.ast.AstRoot astRoot0 = null;
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile1 = null;
        com.google.javascript.jscomp.parsing.Config config3 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, staticSourceFile1, "getters are not supported in older versions of JavaScript. If you are targeting newer versions of JavaScript, set the appropriate language_in option.", config3, errorReporter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

