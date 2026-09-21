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
        java.lang.String str0 = com.google.javascript.jscomp.InlineObjectLiterals.VAR_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "JSCompiler_object_inline_" + "'", str0, "JSCompiler_object_inline_");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.InlineObjectLiterals inlineObjectLiterals2 = new com.google.javascript.jscomp.InlineObjectLiterals(abstractCompiler0, strSupplier1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineObjectLiterals2.process(node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.InlineObjectLiterals inlineObjectLiterals2 = new com.google.javascript.jscomp.InlineObjectLiterals(abstractCompiler0, strSupplier1);
        java.lang.Class<?> wildcardClass3 = inlineObjectLiterals2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
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

