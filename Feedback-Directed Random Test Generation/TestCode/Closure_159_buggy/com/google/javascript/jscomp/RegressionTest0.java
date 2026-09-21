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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.InlineFunctions inlineFunctions5 = new com.google.javascript.jscomp.InlineFunctions(abstractCompiler0, strSupplier1, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.InlineFunctions inlineFunctions5 = new com.google.javascript.jscomp.InlineFunctions(abstractCompiler0, strSupplier1, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.InlineFunctions inlineFunctions5 = new com.google.javascript.jscomp.InlineFunctions(abstractCompiler0, strSupplier1, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.google.javascript.jscomp.InlineFunctions inlineFunctions0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.JSModule jSModule2 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.InlineFunctions.Reference reference5 = inlineFunctions0.new Reference(node1, jSModule2, inliningMode3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.google.javascript.jscomp.InlineFunctions$Reference with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.InlineFunctions inlineFunctions5 = new com.google.javascript.jscomp.InlineFunctions(abstractCompiler0, strSupplier1, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.google.javascript.jscomp.InlineFunctions inlineFunctions0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.JSModule jSModule2 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.InlineFunctions.Reference reference5 = inlineFunctions0.new Reference(node1, jSModule2, inliningMode3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.google.javascript.jscomp.InlineFunctions$Reference with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.InlineFunctions inlineFunctions5 = new com.google.javascript.jscomp.InlineFunctions(abstractCompiler0, strSupplier1, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.InlineFunctions inlineFunctions5 = new com.google.javascript.jscomp.InlineFunctions(abstractCompiler0, strSupplier1, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.InlineFunctions inlineFunctions5 = new com.google.javascript.jscomp.InlineFunctions(abstractCompiler0, strSupplier1, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.InlineFunctions inlineFunctions5 = new com.google.javascript.jscomp.InlineFunctions(abstractCompiler0, strSupplier1, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

