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
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES;
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup0;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        java.util.List<java.lang.String> strList0 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray1 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList2 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList2, jSModuleArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap4 = com.google.javascript.jscomp.AbstractCommandLineRunner.parseModuleWrappers(strList0, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSModuleArray1);
        org.junit.Assert.assertArrayEquals(jSModuleArray1, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

