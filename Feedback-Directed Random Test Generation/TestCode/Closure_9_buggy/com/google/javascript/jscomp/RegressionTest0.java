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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String str0 = com.google.javascript.jscomp.ProcessCommonJSModules.DEFAULT_FILENAME_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "./" + "'", str0, "./");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", true);
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
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("./");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$" + "'", str1, "module$");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$" + "'", str1, "module$");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
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
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$hi!" + "'", str1, "module$hi!");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("./", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("./", "module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jSModule5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("./");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("./", "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$hi!" + "'", str1, "module$module$module$hi!");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$", "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$" + "'", str2, "module$module$");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
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
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$", "module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$" + "'", str2, "module$module$");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
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
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
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
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$" + "'", str2, "module$module$module$");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
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
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$" + "'", str1, "module$module$module$");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("./");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jSModule7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("hi!", "module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$hi!" + "'", str2, "module$hi!");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
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
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("./", "module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("./");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("./");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", true);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$" + "'", str1, "module$module$module$module$");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$hi!", "./");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$hi!" + "'", str2, "module$module$module$module$hi!");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$hi!" + "'", str1, "module$module$module$module$hi!");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$" + "'", str5, "module$module$module$module$");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$" + "'", str1, "module$module$");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$" + "'", str2, "module$module$");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$hi!", "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$hi!" + "'", str2, "module$module$module$hi!");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$", "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$" + "'", str2, "module$module$module$");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
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
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", true);
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
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$hi!", "module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$hi!");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("./", "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", false);
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
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$", "./");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$");
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
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", false);
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
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
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
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$hi!" + "'", str1, "module$module$hi!");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jSModule5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$", "module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$" + "'", str2, "module$module$module$");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$", "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$" + "'", str2, "module$module$");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$", "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$" + "'", str2, "module$module$module$module$");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$", "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
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
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!", false);
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$hi!", "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$hi!");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", true);
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$hi!" + "'", str7, "module$module$module$module$hi!");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$hi!", "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$hi!", "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$");
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
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$", "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$" + "'", str2, "module$module$module$module$");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$hi!", "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$hi!");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$", "./");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$" + "'", str2, "module$module$module$");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$", "module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$" + "'", str2, "module$module$module$module$");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$", true);
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
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$");
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
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("./");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$", "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", false);
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
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass4 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$", "module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$" + "'", str2, "module$module$module$module$module$");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
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
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jSModule5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$hi!", "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$hi!" + "'", str2, "module$hi!");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$hi!" + "'", str2, "module$module$module$module$hi!");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$" + "'", str1, "module$module$module$module$module$");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$hi!", "module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$hi!");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!");
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$hi!" + "'", str4, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$" + "'", str8, "module$module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass4 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("hi!", "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$hi!" + "'", str2, "module$hi!");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$", "module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$" + "'", str2, "module$module$module$module$module$");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!", true);
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", false);
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("hi!", "module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$hi!" + "'", str2, "module$hi!");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$" + "'", str4, "module$module$module$module$");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$hi!", "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$hi!" + "'", str2, "module$module$module$hi!");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("./");
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$", true);
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$hi!");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$", "module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$" + "'", str2, "module$module$module$module$module$");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$hi!", "./");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jSModule7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", false);
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$", "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$", "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$" + "'", str2, "module$module$");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jSModule7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$hi!" + "'", str7, "module$module$module$module$hi!");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", false);
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
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$hi!" + "'", str6, "module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$" + "'", str7, "module$module$module$module$");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$", false);
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
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("./");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$hi!");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jSModule6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass4 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
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
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$", "module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("hi!", "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$hi!" + "'", str2, "module$hi!");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "./");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!", false);
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$");
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jSModule8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!");
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$hi!", "module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$", "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$" + "'", str2, "module$module$module$");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("hi!", "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$hi!" + "'", str2, "module$hi!");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass4 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$" + "'", str2, "module$module$module$module$module$");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$", false);
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
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("./", "./");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$", "module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$" + "'", str2, "module$module$");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$" + "'", str2, "module$module$module$module$");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", true);
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
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("./");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!", false);
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$hi!", "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$", "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$" + "'", str2, "module$module$module$module$module$");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$hi!", "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$hi!" + "'", str2, "module$module$module$module$hi!");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$hi!", "./");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("./");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$hi!");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$" + "'", str2, "module$module$module$module$");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
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
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$hi!", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$hi!");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$" + "'", str4, "module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jSModule8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$" + "'", str2, "module$module$");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$hi!" + "'", str4, "module$module$module$module$hi!");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$hi!");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$hi!", "module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$hi!" + "'", str2, "module$module$module$module$hi!");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$hi!", "module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$hi!" + "'", str2, "module$module$module$module$hi!");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$", false);
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("");
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
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$", false);
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
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$hi!", "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$hi!" + "'", str4, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass4 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$hi!", "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jSModule7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$" + "'", str4, "module$module$module$module$module$");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$" + "'", str5, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$hi!" + "'", str7, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$" + "'", str9, "module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$" + "'", str11, "module$module$module$module$module$");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$hi!" + "'", str2, "module$module$module$hi!");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$", "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
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
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$", false);
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$" + "'", str6, "module$module$");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$hi!", "module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$hi!" + "'", str2, "module$module$module$hi!");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jSModule5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!");
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$hi!" + "'", str5, "module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$" + "'", str7, "module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$hi!" + "'", str6, "module$module$hi!");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$hi!", "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$hi!" + "'", str2, "module$module$module$module$hi!");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$hi!" + "'", str4, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
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
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$", "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$" + "'", str7, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$hi!" + "'", str2, "module$module$module$hi!");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$" + "'", str8, "module$module$");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$");
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
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$" + "'", str8, "module$module$");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$" + "'", str2, "module$module$module$");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jSModule4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$hi!" + "'", str7, "module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$hi!");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$hi!", true);
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
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", true);
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$", "module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jSModule8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jSModule4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$" + "'", str4, "module$module$module$module$module$");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$hi!" + "'", str2, "module$hi!");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$hi!");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass4 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$", "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$hi!");
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$hi!" + "'", str2, "module$module$module$module$hi!");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$hi!", false);
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!", "module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", false);
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$" + "'", str2, "module$module$module$");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!", true);
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!");
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$", "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$" + "'", str7, "module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass4 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$hi!" + "'", str8, "module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jSModule10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("./");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$" + "'", str11, "module$");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$" + "'", str4, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "./");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$" + "'", str5, "module$module$module$module$");
    }
}

