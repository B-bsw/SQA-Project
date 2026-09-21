package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$" + "'", str9, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jSModule8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass10 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$" + "'", str7, "module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$" + "'", str5, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$hi!" + "'", str7, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jSModule9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$" + "'", str12, "module$module$module$module$module$");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jSModule7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("./", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "./");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$" + "'", str11, "module$module$module$module$");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$hi!" + "'", str6, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$hi!" + "'", str2, "module$hi!");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$hi!" + "'", str5, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jSModule7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$hi!" + "'", str7, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.Class<?> wildcardClass13 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$hi!" + "'", str6, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$" + "'", str12, "module$");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$hi!" + "'", str7, "module$hi!");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$" + "'", str5, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$hi!" + "'", str7, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$" + "'", str9, "module$");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass11 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$" + "'", str7, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass13 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$" + "'", str5, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$hi!" + "'", str7, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$" + "'", str9, "module$");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$hi!" + "'", str12, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$" + "'", str5, "module$module$module$module$");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jSModule6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$hi!" + "'", str5, "module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str15 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str17 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str13, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str15, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str17, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("hi!");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$hi!" + "'", str8, "module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jSModule6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$" + "'", str5, "module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule13 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$hi!" + "'", str2, "module$hi!");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$" + "'", str6, "module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$" + "'", str9, "module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$" + "'", str6, "module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$" + "'", str9, "module$");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$hi!", "module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jSModule9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jSModule4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str14 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$hi!" + "'", str12, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str14, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jSModule11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("./");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jSModule8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$" + "'", str5, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$" + "'", str2, "module$module$module$module$");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$hi!" + "'", str7, "module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jSModule7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$" + "'", str10, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str14 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$hi!" + "'", str10, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str14, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$hi!" + "'", str7, "module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jSModule6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$hi!" + "'", str5, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$" + "'", str7, "module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$hi!" + "'", str6, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$" + "'", str2, "module$module$module$");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass9 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$" + "'", str7, "module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str15 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str17 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str13, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str15, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str17, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules2.getModule();
        java.lang.String str12 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str12, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$hi!" + "'", str8, "module$hi!");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass11 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$" + "'", str10, "module$");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$" + "'", str10, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$" + "'", str11, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$" + "'", str13, "module$module$");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$hi!" + "'", str8, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$hi!" + "'", str8, "module$hi!");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$");
    }
}

