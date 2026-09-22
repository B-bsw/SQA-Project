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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.io.PrintStream printStream3 = null;
        java.io.PrintStream printStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CommandLineRunner commandLineRunner5 = new com.google.javascript.jscomp.CommandLineRunner(strArray2, printStream3, printStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
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
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CommandLineRunner commandLineRunner5 = new com.google.javascript.jscomp.CommandLineRunner(strArray4);
            org.junit.Assert.fail("Expected exception of type org.kohsuke.args4j.CmdLineException; message: No argument is allowed: ");
        } catch (org.kohsuke.args4j.CmdLineException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "hi!" };
        java.io.PrintStream printStream4 = null;
        java.io.PrintStream printStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CommandLineRunner commandLineRunner6 = new com.google.javascript.jscomp.CommandLineRunner(strArray3, printStream4, printStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        java.io.PrintStream printStream6 = null;
        java.io.PrintStream printStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CommandLineRunner commandLineRunner8 = new com.google.javascript.jscomp.CommandLineRunner(strArray5, printStream6, printStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!", "hi!", "", "" });
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.io.PrintStream printStream4 = null;
        java.io.PrintStream printStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CommandLineRunner commandLineRunner6 = new com.google.javascript.jscomp.CommandLineRunner(strArray3, printStream4, printStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        java.io.PrintStream printStream5 = null;
        java.io.PrintStream printStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CommandLineRunner commandLineRunner7 = new com.google.javascript.jscomp.CommandLineRunner(strArray4, printStream5, printStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "", "" });
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "" };
        java.io.PrintStream printStream7 = null;
        java.io.PrintStream printStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CommandLineRunner commandLineRunner9 = new com.google.javascript.jscomp.CommandLineRunner(strArray6, printStream7, printStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "" });
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.io.PrintStream printStream2 = null;
        java.io.PrintStream printStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CommandLineRunner commandLineRunner4 = new com.google.javascript.jscomp.CommandLineRunner(strArray1, printStream2, printStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CommandLineRunner commandLineRunner7 = new com.google.javascript.jscomp.CommandLineRunner(strArray6);
            org.junit.Assert.fail("Expected exception of type org.kohsuke.args4j.CmdLineException; message: No argument is allowed: ");
        } catch (org.kohsuke.args4j.CmdLineException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }
}

