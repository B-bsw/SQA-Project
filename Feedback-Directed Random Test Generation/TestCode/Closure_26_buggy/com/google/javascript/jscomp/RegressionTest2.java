package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$hi!" + "'", str2, "module$module$module$module$hi!");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$hi!" + "'", str2, "module$module$module$hi!");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$", "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$hi!" + "'", str4, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$hi!");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$");
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
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$" + "'", str7, "module$module$");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$" + "'", str8, "module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("./");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$" + "'", str12, "module$");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
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
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
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
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$" + "'", str5, "module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$" + "'", str9, "module$module$");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("./");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$" + "'", str4, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
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
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$hi!");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$hi!" + "'", str7, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
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
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass6 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
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
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass12 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$hi!" + "'", str6, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$" + "'", str4, "module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass4 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.Class<?> wildcardClass12 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$" + "'", str11, "module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", true);
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
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = jSModule13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$");
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
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$hi!", "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$" + "'", str2, "module$module$module$module$module$");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$" + "'", str7, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$" + "'", str7, "module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$hi!" + "'", str7, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jSModule6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jSModule8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$" + "'", str2, "module$module$module$module$");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jSModule10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$hi!" + "'", str10, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$");
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!");
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
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$" + "'", str7, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$" + "'", str4, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$hi!" + "'", str7, "module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$" + "'", str10, "module$");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("hi!", "module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$hi!" + "'", str2, "module$hi!");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", false);
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
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jSModule6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$hi!", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("./");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jSModule5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", false);
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
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$" + "'", str8, "module$module$");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$hi!" + "'", str4, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("./", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$" + "'", str4, "module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$hi!" + "'", str5, "module$module$module$hi!");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$hi!" + "'", str7, "module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$" + "'", str11, "module$module$module$module$module$");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
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
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", true);
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
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$" + "'", str2, "module$module$module$");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$hi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$hi!" + "'", str6, "module$module$hi!");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
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
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$" + "'", str10, "module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jSModule5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str13, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        java.lang.String str17 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str13, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str15, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str17, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$" + "'", str7, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$" + "'", str7, "module$module$module$module$");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass4 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str14 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str14, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
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
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$" + "'", str10, "module$");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass9 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$");
        java.lang.Class<?> wildcardClass12 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jSModule9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass9 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$" + "'", str7, "module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$", false);
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
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$hi!" + "'", str4, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$hi!");
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
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jSModule10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass10 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("./");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$" + "'", str9, "module$");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule14 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str13, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", true);
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
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
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
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$" + "'", str6, "module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!", true);
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
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str13, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass13 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$hi!" + "'", str10, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$hi!" + "'", str8, "module$hi!");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$hi!" + "'", str2, "module$module$module$hi!");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", true);
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
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$" + "'", str5, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$hi!" + "'", str7, "module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$", "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$" + "'", str2, "module$module$module$module$");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!", true);
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
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = jSModule3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$" + "'", str5, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$hi!" + "'", str7, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$" + "'", str9, "module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = jSModule3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$", "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$" + "'", str13, "module$");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
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
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$hi!", true);
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
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$" + "'", str4, "module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$");
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
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
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
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
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
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        java.lang.String str14 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node15, node16);
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
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str14, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("./");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("hi!");
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$" + "'", str6, "module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$hi!" + "'", str9, "module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$hi!", "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$hi!" + "'", str2, "module$module$module$module$hi!");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass11 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!", false);
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
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$hi!" + "'", str9, "module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$hi!" + "'", str11, "module$hi!");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$hi!" + "'", str6, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
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
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$hi!" + "'", str4, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$" + "'", str6, "module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$" + "'", str4, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$" + "'", str4, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
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
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str13, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$hi!" + "'", str5, "module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("./", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$" + "'", str4, "module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
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
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
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
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$hi!" + "'", str6, "module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jSModule5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$hi!" + "'", str4, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
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
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
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
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
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
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jSModule5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!");
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
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
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
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$" + "'", str4, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$hi!");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$" + "'", str7, "module$module$");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$");
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
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$" + "'", str7, "module$module$");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$" + "'", str7, "module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$" + "'", str9, "module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
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
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("hi!");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$hi!" + "'", str7, "module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
}

